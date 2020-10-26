<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>로그인</title>
</head>
<body>
	<form:form action="login.do" commandName="loginCommand">
		<%--
			필드가 없으므로 path를 사용할 수 없음 -> 필드가 없는 에러 메시지가 표시됨
			기본적으로 span태그에 에러 메시지가 표시됨
			element="div"를 명시하면 div태그에 에러 메시지를 표시, 즉 줄바꿈이 됨
			
		--%>
		<form:errors element="div"/>
		아이디 : <form:input path="userId"/>
		<form:errors path="userId"/>
		<br>
		비밀번호 : <form:password path="password"/>
		<form:errors path="password"/>
		<br>
		<input type="submit" value="전송">
	</form:form>
</body>
</html>