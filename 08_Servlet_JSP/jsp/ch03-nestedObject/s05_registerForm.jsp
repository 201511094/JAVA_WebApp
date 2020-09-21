<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>[실습] 회원가입</title>
</head>
<body>
	<!-- 
		이름(name), ID(id), 비밀번호(password), 전화번호(phone), 자기소개(textarea, content)
		s06_register.jsp로 전송, post방식
		s06_register.jsp에서 전송된 데이터 출력
		ex)
		이름 : 홍길동
		ID : dragon
		비밀번호 : 1234
		전화번호 : 010-1234-5678
		자기소개 : 안녕하세요.
	 -->
	 <form action="s06_register.jsp" method="post">
	 	이름 : <input type="text" name="name" size="10"><br>
	 	ID : <input type="text" name="id" size="10"><br>
	 	비밀번호 : <input type="password" name="password" size="10"><br>
	 	전화번호 : <input type="text" name="phone" size="20"><br>
	 	자기소개 :<br> <textarea name="content" rows="5" cols="30"></textarea><br>
	 	<input type="submit" value="전송"> 
	 </form>
</body>
</html>