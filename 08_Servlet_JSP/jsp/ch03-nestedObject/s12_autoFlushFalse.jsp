<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ page buffer="1kb" autoFlush="false" %>	<!-- 건드리지 않을 속성 2가지, 기본값 사용하기 -->

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>autoFlush 속성값 false 예제</title>
</head>
<body>
<%
	for (int i=0; i<1000; i++) {
%>
		1234	<!-- JSP 버퍼 오버플로우 -->
<%		
	}
%>
</body>
</html>