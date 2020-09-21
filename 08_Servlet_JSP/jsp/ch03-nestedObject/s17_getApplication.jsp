<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ page import="java.util.Enumeration" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>application 기본 객체 속성 보기</title>
</head>
<body>
<%
	//application에 저장된 모든 속성명 반환
	Enumeration attrEnum = application.getAttributeNames();

	while (attrEnum.hasMoreElements()) {
		String name = (String)attrEnum.nextElement();
		Object value = application.getAttribute(name);		
%>
	<!-- applilcation에는 일반 데이터를 넣지 않는게 좋음, 다른 클라이언트 공유가 가능해지므로 -->
	<!-- 서버를 재시작하면 (userId, dragon)은 삭제됨 -->
		application 속성 : <b><%= name %></b> = <%= value %><br>
<%
	}
%>
</body>
</html>