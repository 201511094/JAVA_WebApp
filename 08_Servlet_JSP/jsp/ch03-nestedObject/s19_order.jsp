<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ page import="java.util.HashMap" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>주문서 확인</title>
</head>
<body>
<!-- 
	짜장면 4,000원, 짬뽕 5,000원, 볶음밥 6,000원
	출력예시)
	[주문 음식]
	짜장면 2개
	짬뽕 1개
	총 지불금액 : 13,000원
 -->
 <%
 	request.setCharacterEncoding("utf-8");
 	
 	HashMap<String,Integer> map = new HashMap<String,Integer>();
 	map.put("짜장면", 4000);
 	map.put("짬뽕", 5000);
 	map.put("볶음밥", 6000);
 	
 	int total_price = 0;
 %>
 	[주문 음식]<br>

	총 지불금액 : <%= total_price %>원
</body>
</html>