<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>폼 생성</title>
</head>
<body>
	폼에 데이터를 입력한 후 전송 버튼을 클릭하세요.
	<form action="s02_viewParameter.jsp" method="post">
		이름 : <input type="text" name="name" size="10"><br>
		주소 : <input type="text" name="address" size="10"><br>
		좋아하는 동물 : 
		<input type="checkbox" name="pet" value="dog">강아지
		<input type="checkbox" name="pet" value="cat">고양이
		<input type="checkbox" name="pet" value="pig">돼지
		<br>
		<input type="submit" value="전송">	
	</form>
	<!-- 
		이름과 주소를 적지 않고 체크박스를 선택하지 않고 get방식으로 전송할 경우,
		name="", address="", 체크박스는 전송되지 않음
		input type="text"이기 때문에 이름과 주소는 null이 아니라 빈 문자열이 전송됨
	 -->
</body>
</html>