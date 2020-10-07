<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.member.Member" %>
 <%-- jar파일을 읽어오기 위한 식별자, 접두사는 c --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>set 태그</title>
</head>
<body>
	<%-- "msg"는 속성명, "봄"은 속성값, "page"는 영역 --%>
	<%-- scope을 생략하면 기본값으로 page영역에 저장 --%>
	<c:set var="msg" value="봄" scope="page"/>
	${ pageScope.msg }, ${ msg }<br>	<%-- 봄, 봄 --%>
	
	<%
	Member member = new Member();
	%>
	<%-- Member객체를 page영역에 저장 --%>
	<c:set var="member" value="<%= member %>" />
	<%-- 			page영역에 저장된 객체,	객체의 멤버변수,	저장될 값 --%>
	<c:set target="${ member }" property="name" value="홍길동" />
	<%-- EL의 문법 표준, private한 변수인 name을 명시하면 자동으로 public한 메소드인 getName()을 호출 --%>
	회원 이름 : ${ member.name }<br>
	회원 이름 : ${ member.getName() }<br>
</body>
</html>