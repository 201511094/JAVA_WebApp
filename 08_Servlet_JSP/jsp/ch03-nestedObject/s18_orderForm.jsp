<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>주문서</title>
</head>
<body>
	<form action="s19_order.jsp" method="post">
		<ul>
			<li>
				<label for="c0">짜장면</label>
				<input type="number" name="food_c0" id="c0" min="0" max="99" value="0">
			</li>
			<li>
				<label for="c1">짬뽕</label>
				<input type="number" name="food_c1" id="c1" min="0" max="99" value="0">
			</li>
			<li>
				<label for="c2">볶음밥</label>
				<input type="number" name="food_c2" id="c2" min="0" max="99" value="0">
			</li>
		</ul>
		<div>
			<input type="submit" value="전송">
		</div>
	</form>
</body>
</html>