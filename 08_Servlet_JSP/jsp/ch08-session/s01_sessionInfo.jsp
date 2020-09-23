<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%
	Date time = new Date();
	SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>세션 정보</title>
</head>
<body>
	세션 ID : <%= session.getId() %><br>	
	세션 생생 시간 : <%= session.getCreationTime() %><br>	<!-- long타입 -->
<%
	time.setTime(session.getCreationTime());
%>
	세션 생성 시간 : <%= sf.format(time) %><br>
	최근 접근 시간 : <%= session.getLastAccessedTime() %><br>
<%
	time.setTime(session.getLastAccessedTime());
%>
	최근 접근 시간 : <%= sf.format(time) %><br>
	
	세션 유지 시간 변경하기 (기본 세션 유지 시간은 30분)<br>
<%
	session.setMaxInactiveInterval(60*20);	//20분
	//web.xml에 50분으로 지정된 상태이지만, JSP에서 유지 시간을 20분으로 변경하면
	//JSP에 지정한 시간이 우선적으로 적용됨. web.xml에서 일괄적으로 지정하는 것을 권장
%>
	세션 유지 시간 : <%= session.getMaxInactiveInterval() %>초
</body>
</html>