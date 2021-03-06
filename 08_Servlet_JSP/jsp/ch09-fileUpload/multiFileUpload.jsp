<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.oreilly.servlet.MultipartRequest" %>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>파일 다중 업로드 처리</title>
</head>
<body>
<%
	String realFolder = "";			//절대 경로
	String saveFolder = "/upload";	//상대 경로
	String encType = "utf-8";		//인코딩 타입
	int maxSize = 10*1024*1024;		//최대 업로드 파일 크기, 10MB
	
	//절대 경로 구하기
	realFolder = application.getRealPath(saveFolder);
	
	MultipartRequest multi = new MultipartRequest(request, realFolder, maxSize, encType,
			new DefaultFileRenamePolicy());
%>
	제목 : <%= multi.getParameter("subject") %><br>
	<img src="../upload/<%= multi.getFilesystemName("uploadFile1") %>" width="300" height="300">
	<img src="../upload/<%= multi.getFilesystemName("uploadFile2") %>" width="300" height="300">
</body>
</html>