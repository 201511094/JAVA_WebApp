<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>계정 생성</title>
</head>
<body>
	<%--
		method를 명시하지 않으면 기본값은 POST방식
		commandName을 생략하면 기본값은 command, 따라서 여기서 생략 가능
		command는 자바빈! request에 저장된 command를 읽어옴
	--%>
	<form:form action="create.do" commandName="command">
		<%-- form:input은 input type="text"와 동일, form:errors는 유효성 체크 문구를 표시하는 span태그 --%>
		<%-- path에는 자바빈의 프로퍼티(필드)를 명시 --%>
		아이디 : <form:input path="id"/>
		<form:errors path="id"/>
		<br>
		이름 : <form:input path="name"/>
		<form:errors path="name"/>
		<br>
		우편번호 : <form:input path="zipcode"/>
		<form:errors path="zipcode"/>
		<br>
		주소1 : <form:input path="address1"/>
		<form:errors path="address1"/>
		<br>
		주소2 : <form:input path="address2"/>
		<form:errors path="address2"/>
		<br>
		<input type="submit" value="전송">
	</form:form>
</body>
</html>