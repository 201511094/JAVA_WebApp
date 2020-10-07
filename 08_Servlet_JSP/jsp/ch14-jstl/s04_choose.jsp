<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>choose 태그</title>
</head>
<body>
<%-- choose-when-otherwise 다중 조건 체크--%>
	<c:choose>
		<c:when test="${ param.name=='dragon' && param.age >= 20 }">
			당신의 이름은 ${ param.name }이고 20세 이상입니다.<br>
		</c:when>
		<c:when test="${ param.name=='dragon'}">
			당신의 이름은 ${ param.name } 입니다.<br>
		</c:when>
		<c:when test="${ param.age >= 20 }">
			당신의 나이는 20세 이상입니다.<br>
		</c:when>
		<c:otherwise>
			당신은 dragon이 아니고 20세 이상이 아닙니다.
		</c:otherwise>
	</c:choose>
</body>
</html>