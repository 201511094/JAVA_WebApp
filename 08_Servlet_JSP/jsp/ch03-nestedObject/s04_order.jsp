<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ page import="java.util.HashMap" %>	<%-- 가격 리스트 --%>

<%--
	구매 금액이 30만원 미만이면 배송비 5천원 추가
	[출력예시]
	이름 :
	닐짜 :
	구매 상품 :
	총 구매비용(배송비 포함) :
--%>
<%
	//전송된 데이터 인코딩 처리
	request.setCharacterEncoding("utf-8");

	//상품의 가격 저장, 가격 목록
	HashMap<String,Integer> map = new HashMap<String,Integer>();
	map.put("가방", 200000);
	map.put("신발", 100000);
	map.put("옷", 50000);
	map.put("식사권", 150000);
	
	//배열을 사용하는 방법
	//int[] price = {200000, 100000, 50000, 150000};
	
	//기본 배송비
	int delivery_fee = 5000;
%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>구매 내역</title>
</head>
<body>
	<h3>구매 내역</h3>
	이름 : <%= request.getParameter("name") %><br>
	날짜 : <%= request.getParameter("order_date") %><br>
	구매 상품 : 
<%
	String[] items = request.getParameterValues("item");
	int sum = 0;
	
	if (items != null) {
		for (int i=0; i<items.length; i++) {
			//구매 상품의 금액을 sum에 누적
			sum += map.get(items[i]);	//value를 통해 가격을 가져옴
%>
		<%= items[i] %>
	<%		
		}//end of for	
		if (sum < 300000) sum += delivery_fee;	//배송비 추가
		else delivery_fee = 0;
	%>
<%
	}//end of if
%>
	<br>
	배송비 : <%= delivery_fee %>원<br>
	총 구매비용(배송비 포함) : <%= sum %>원 
</body>
</html>