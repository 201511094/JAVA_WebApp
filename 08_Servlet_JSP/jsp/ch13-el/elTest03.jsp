<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>EL 예제</title>
</head>
<body>
<%
	pageContext.setAttribute("msg1", "봄");
	request.setAttribute("msg2", "여름");
	session.setAttribute("msg3", "가을");
	application.setAttribute("msg4", "겨울");
	
	String str = "서울";
	pageContext.setAttribute("city", str);
%>
<%--
	EL 표기법을 이용해서 JSP 4개 영역에 저장된 데이터를 읽어올 때
	pageScope, requestScope, sessionScope, applicationScope을 이용해서
	저장된 데이터를 읽어올 수 있음.
	JSP 4개 영역에 값이 저장되어 있어야 값 읽어오기 가능.
	
	EL의 내장 객체를 생략하고 속성명만 명시할 경우 ex) msg1~4
	page->request->session->application영역 순으로 검색해서 결과를 반환함.
	
	EL은 Model2방식에서 사용함.
 --%>
	page scope(영역) : ${ msg1 }<br>
	request scope : ${ msg2 }<br>
	session scope : ${ msg3 }<br>
	application scope : ${ msg4 }<br>
	
	스크립트릿에서 선언한 변수의 값 읽기 : ${ str }<br>
	page영역에 저장된 값 읽기 : ${ city }
</body>
</html>