<!-- %@ page 디렉티브 : jsp설정 -->
<!-- jsp에서는 java만 사용가능, 생성할 문서의 타입과 인코딩 방식 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!-- jsp페이지에서 사용할 자바 클래스를 import해서 사용 -->
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>

<!-- 자바 영역 -->
<%
	Date nowTime = new Date();	//Date 객체 생성
%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>오늘의 날짜와 시간</title>
</head>
<body>
	현재 날짜와 시간은 <%= nowTime %> 입니다.	<!-- 표현식 -->
	<br>--------------------<br>
	<%
		SimpleDateFormat sf = new SimpleDateFormat("yyyy년MM월dd일 a hh:mm:ss");
	%>
	현재 날짜와 시간은 <%= sf.format(nowTime) %> 입니다.
</body>
</html>