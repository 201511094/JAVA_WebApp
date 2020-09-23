<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 파일 업로드, 절대 경로가 필요 -->
<%@ page import="com.oreilly.servlet.MultipartRequest" %>
<!-- 파일 이름 바꾸기 -->
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<!-- 파일 용량 구하기 -->
<%@ page import="java.io.File" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>파일 업로드 처리</title>
</head>
<body>
<%
	String realFolder = "";	//파일 업로드 경로의 절대 경로
	
	//파일 업로드 경로
	String saveFolder = "/upload";	//상대 경로, 일부만 보여줌
	String encType = "utf-8";	//인코딩 타입
	int maxSize = 5*1024*1024;	//파일의 최대 업로드 사이즈, 5MB
	
	//파일 업로드 절대 경로 구하기
	realFolder = application.getRealPath(saveFolder);
	
	out.println("파일 업로드 절대 경로 : " + realFolder + "<br>");
	out.println("--------------------<br>");
	
	//MultipartRequest(request, upload 절대 경로, 파일 최대 업로드 사이즈, 인코딩 타입, DefaultFileRenamePolicy객체)
	MultipartRequest multi = new MultipartRequest(request, realFolder, maxSize, encType,
			new DefaultFileRenamePolicy()	//이미 업로드된 파일과 동일한 파일명일 경우 파일명 교체, 뒤에 숫자 붙이기
		);
	
	//파일을 업로드하면 request.getParameter가 동작하지 않음
	//request 대신 multi 사용
	out.println("작성자 : " + multi.getParameter("user") + "<br>");
	out.println("제목 : " + multi.getParameter("title") + "<br>");
	out.println("--------------------<br>");
	
	//파일 정보 처리, 인자인 uploadFile은 파일명
	//전송전 원래의 파일 이름 반환
	String original = multi.getOriginalFileName("uploadFile");
	//서버에 저장된 파일 이름 반환
	String filename = multi.getFilesystemName("uploadFile");
	//전송된 파일의 컨텐트 타입
	String type = multi.getContentType("uploadFile");
	
	out.println("전송전 원래의 파일 이름 : " + original + "<br>");
	out.println("서버에 저장된 파일 이름 : " + filename + "<br>");
	out.println("컨텐트 타입 : " + type + "<br>");
	
	//파일의 용량 구하기
	File file = multi.getFile("uploadFile");
	if (file != null) {
		out.println("파일 용량 : " + file.length() + "bytes");	//바이트 단위
	}
%>
	<!-- 절대 경로 realFolder
		= C:\javaWork\workspace_jsp\.metadata\.plugins\
		org.eclipse.wst.server.core\tmp1\wtpwebapps\jspMain2\upload -->
</body>
</html>