<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>formatNumber 태그</title>
</head>
<body>
	숫자 : <fmt:formatNumber value="10000" type="number"/><br>	<%-- 10,000 --%>
	통화 : <fmt:formatNumber value="10000" type="currency" currencySymbol="\\"/><br>	<%-- \10,000 --%>
	퍼센트 : <fmt:formatNumber value="0.1" type="percent"/><br>	<%-- 10% --%>
	패턴 : <fmt:formatNumber value="12.345" pattern="00.00"/>	<%-- 12.5 --%>
</body>
</html>