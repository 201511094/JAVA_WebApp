<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>EL 예제</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>표현식</th>
			<th>값</th>
		</tr>
		<tr>
			<td>\${2 + 5}</td>
			<td>${2 + 5}</td>
		</tr>
		<tr>
		<!-- EL에서는 연결이 아닌 연산을 수행 -->
			<td>\${"10" + 5}</td>
			<td>${"10" + 5}</td>
		</tr>
		<tr>
			<td>\${"10" + "5"}</td>
			<td>${"10" + "5"}</td>
		</tr>
		<tr>
		<!-- 에러 발생 -->
			<td>\${"십" + 5}</td>
			<td>에러 발생(EL에서의 +는 연산만 가능)</td>
		</tr>
		<tr>
		<!-- 정수와 정수의 연산 수행 결과 실수가 나옴, 자바스크립트처럼 -->
			<td>\${4/5}</td>
			<td>${4/5}</td>
		</tr>
		<tr>
		<!-- 0으로 나눌 경우 Infinity, 자바스크립트처럼 -->
			<td>\${5/0}</td>
			<td>${5/0}</td>
		</tr>
	</table>
</body>
</html>