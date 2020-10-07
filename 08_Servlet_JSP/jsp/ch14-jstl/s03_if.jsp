<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>if 태그</title>
</head>
<body>
<%-- if 태그는 단일 조건 체크 --%>
	<c:if test="true">
		무조건 실행<br>
	</c:if>
	<%-- 문자열 비교이지만 비교연산자 == 사용 가능, 문자열이지만 작은따옴표 사용을 허용 --%>
	<c:if test="${ param.name=='dragon' }">
		name 파라미터의 값이 ${ param.name } 입니다.<br>
	</c:if>
	<%-- tomcat7버전 이상부터 equals 비교 지원 --%>
	<c:if test="${ param.name.equals('dragon') }">
		name 파라미터의 값이 ${ param.name } 입니다.<br>
	</c:if>
	<c:if test="${ param.age >= 20 }">
		당신의 나이는 20세 이상입니다.
	</c:if>
</body>
</html>