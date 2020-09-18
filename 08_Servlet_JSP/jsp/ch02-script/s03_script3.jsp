<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>[실습]성적 처리</title>
</head>
<body>
	<%--
		[실습] 배열(score) 생성 - 국어, 수학, 영어
			출력 예시)
			국어 : 88
			수학 : 99
			영어 : 86
			총점 : 273
			평균 : 91
	 --%>
<%
	String[] subject = {"국어", "수학", "영어"};
	int[] score = {88, 99, 86};
	int sum=0, avg;
	 	
	for (int i=0; i<score.length; i++) {
%>		
	<%= subject[i] %> : <%= score[i] %><br>
<% 
		sum += score[i];
	}
	avg = sum/score.length;
%>
	총점 : <%= sum %><br>
	평균 : <%= avg %>
</body>
</html>