<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>response.sendRedirect() 테스트</title>
</head>
<body>
	현재 페이지는 s09_responseA.jsp입니다.
	화면에 보여지지 않습니다.
</body>
</html>
<%
	//리다이렉트
	response.sendRedirect("s10_responseB.jsp");
%>