<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>스크립트 연습</title>
</head>
<body>
	<h2>배열의 내용 출력 - 선언부, 스크립트릿</h2>
<%!
	//선언부 : 변수 선언, 메서드 선언 -> 멤버
	String[] str = {"JSP가", "정말", "재미", "있다"};
%>
	<table border="1">
		<tr>
			<th>배열의 인덱스</th>
			<th>배열의 내용</th>
		</tr>
	<%
		//스크립트릿 : 변수 선언, 연산, 제어문, 출력 -> 지역
		for (int i=0; i<str.length; i++) {
			out.println("<tr>");
			out.println("	<td>" + i + "</td>");
			out.println("	<td>" + str[i] + "</td>");
			out.println("</tr>");
		}
	%>
	</table>
	<br>
	<h2>배열의 내용 출력 - 선언부, 스크립트릿, 표현식</h2>
	<table border="1">
		<tr>
			<th>배열의 인덱스</th>
			<th>배열의 내용</th>
		</tr>
		<!-- 스크립트립 안에 표현식을 사용할 수 없음 -->
	<%
		//루프 영역
		for (int i=0; i<str.length; i++) {
	%>
			<!-- 반복 -->
			<tr>
				<!-- 표현식 : 변수의 값 출력, 메서드의 결과값 출력, 연산의 결과 출력 -->
				<%--JSP 주석 : 소스 보기할 때 보여지지 않음 --%>
				<td><%= i %></td>
				<td><%= str[i] %></td>
			</tr>
	<%
		}
	%>
	</table>
	<br>
	<h2>배열의 내용 출력 - 확장 for문 사용</h2>
	<table border="1">
		<tr>
			<!-- 확장for문은 인덱스 사용 불가, 데이터만을 반환해서 사용 -->
			<th>배열의 내용</th>
		</tr>
	<%
		//루프 영역
		for (String s: str) {
	%>
			<tr>
				<td><%= s %></td>	<!-- s가 데이터 -->
			</tr>
	<%
		}
	%>
	</table>
</body>
</html>