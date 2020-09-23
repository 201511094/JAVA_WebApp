<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>로그인 여부 검사</title>
</head>
<body>
<%
	//session에 저장된 id가 있는지 확인, getAttribute(속성명)
	String userId = (String)session.getAttribute("userId");
	if (userId != null) {
		//로그인 된 경우
%>
		아이디 [<%= userId %>]로 로그인 한 상태!<br>
		<input type="button" value="로그아웃" onclick="location.href='s05_sessionLogout.jsp'">	
<%
	}
	else {
		//로그인이 되지 않은 경우
%>
		로그인하지 않은 상태
		<br>
		<!-- location.href='' :  해당 페이지로 이동 -->
		<input type="button" value="로그인" onclick="location.href='s02_sessionLoginForm.jsp'">
<%
	}
%>
</body>
</html>