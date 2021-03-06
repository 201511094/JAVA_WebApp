<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>forTokens 태그</title>
</head>
<body>
	콤마와 점을 구분자로 사용 : <br>
	<%-- delims에는 구분자 작성 --%>
	<c:forTokens var="token" items="빨간색,주황색,노란색.초록색,파랑색.남색,보라색" delims=",.">
		${ token }<br>
	</c:forTokens>
	<br>
	연월일시분초로 출력(구분자를 이용해서 분리)<br>
	<c:forTokens var="now" items="2020-10-07 12:49:10" delims="- :">
		${ now }<br>
	</c:forTokens>
</body>
</html>