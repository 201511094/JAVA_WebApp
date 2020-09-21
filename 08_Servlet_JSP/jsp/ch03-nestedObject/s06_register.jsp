<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%
	//전송된 데이터 인코딩 처리
	request.setCharacterEncoding("utf-8");
%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>회원정보</title>
</head>
<body>
	<h3>회원정보</h3>
	이름 : <%= request.getParameter("name") %><br>
	ID : <%= request.getParameter("id") %><br>
	비밀번호 : <%= request.getParameter("password") %><br>
	전화번호 : <%= request.getParameter("phone") %><br>
	자기소개 : <%= request.getParameter("content") %>
</body>
</html>