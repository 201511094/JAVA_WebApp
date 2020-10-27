<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>회원가입</title>
</head>
<body>
	<form:form action="write.do" commandName="command">
		아이디 : <form:input path="id"/>
		<form:errors path="id"/>
		<br>
		비밀번호 : <form:password path="password"/>
		<form:errors path="password"/>
		<br>
		이름 : <form:input path="name"/>
		<form:errors path="name"/>
		<br>
		생년월일 : <input type="date" name="id" id="birth" value="${ command.birth }"/>	<!-- 자바빈에서 데이터를 읽어옴 -->
		<form:errors path="birth"/>
		<br>
		나이 : <input type="number" name="age" id="age" value="${ command.age }"/>	<!-- 자바빈에서 데이터를 읽어옴 , 초기값 0 -->
		<form:errors path="age"/>
		<br>
		이메일 : <form:input path="email"/>
		<form:errors path="email"/>
		<br>
		<input type="submit" value="전송">
	</form:form>
</body>
</html>