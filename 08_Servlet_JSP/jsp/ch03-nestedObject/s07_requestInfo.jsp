<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>클라이언트 및 서버 정보</title>
</head>
<body>
	<!-- localhost로 접속하면 IPv6 형태로 보여짐 -->
	(*)클라이언트 IP = <%= request.getRemoteAddr() %><br>
	요청정보 프로토콜 = <%= request.getProtocol() %><br>
	(*)요청정보 전송방식 = <%= request.getMethod() %><br>	<!-- get/post -->
	<!-- URL : 서버 바깥에서 데이터를 요청할 때, 전체 주소 사용, http://localhost:8080/ 포함 -->
	<!-- URI : 같은 서버 내의 데이터를 요청할 때, 앞에 경로 생략-->
	(*)요청 URL(Uniform Resource Locator) = <%= request.getRequestURL() %><br>
	(*)요청 URI(Uniform Resource Identifier식별자) = <%= request.getRequestURI() %><br>
	<!-- 컨텍스트는 프로그램 -->
	(*)컨텍스트 경로 = <%= request.getContextPath() %><br>
	서버 이름 = <%= request.getServerName() %><br>
	서버 포트 = <%= request.getServerPort() %>
</body>
</html>