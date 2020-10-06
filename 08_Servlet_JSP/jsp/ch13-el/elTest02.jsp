<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//전송된 데이터 인코딩 처리
	request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>EL 예제</title>
</head>
<body>
	<form action="elTest02.jsp" method="post">
		이름 <input type="text" name="name">
		<input type="submit" value="전송">
	</form>
	<br>
	이름은 <%= request.getParameter("name") %><br>
	이름은 ${ param.name }
</body>
</html>