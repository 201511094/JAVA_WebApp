<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title><spring:message code="login.form.title"/></title>
</head>
<body>
	<form:form action="login.do" commandName="login">
		<form:errors element="div"/>
		<p>
			<label for="id"><spring:message code="login.form.id"/></label>
			<form:input path="id"/>
			<form:errors path="id"/>
		</p>
		<p>
			<label for="password"><spring:message code="login.form.password"/></label>
			<form:password path="password"/>
			<form:errors path="password"/>
		</p>
		<p>
			<input type="submit" value="<spring:message code="login.form.submit"/>">
		</p>
	</form:form>
</body>
</html>