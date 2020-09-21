<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>JSP 4개 기본 객체와 영역</title>
</head>
<body>
	<!-- msg1은 null -> 공유x, pageContext는 같은 페이지에서만 공유가 가능, 공유범위가 좁음 -->
	page 영역의 msg1 = <%= pageContext.getAttribute("msg1") %><br>
	<!-- msg2는 null -> 현재는 공유x, 공유범위 확장 가능 -->
	request 영역의 msg2 = <%= request.getAttribute("msg2") %><br>
	<!-- msg3는  "가을" -> 공유o, 세션은 브라우저당 하나씩 만들어짐, 같은 브라우저라면 세션을 공유 -->
	<!-- 세션은 로그인에서 주로 사용 -->
	session 영역의 msg3 = <%= session.getAttribute("msg3") %>
</body>
</html>