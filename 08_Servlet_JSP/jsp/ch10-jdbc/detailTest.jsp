<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Date" %>
<%@ include file="dbInfo.jspf" %>	<%-- jsp파일에 dbInfo.jspf를 삽입해서 변수 공유 --%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>글 상세 정보 보기</title>
	<link rel="stylesheet" href="style.css" type="text/css">
</head>
<body>
<%
	//Get방식으로 num을 넘겨서 받음
	int num = Integer.parseInt(request.getParameter("num"));
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql = null;
	
	try {
		//JDBC 수행 1단계 : 드라이버 로드
		Class.forName(driverName);
		//JDBC 수행 2단계  : Connection 객체 생성
		conn = DriverManager.getConnection(jdbcUrl, dbId, dbPass);
		//SQL문 작성
		sql = "SELECT * FROM tboard WHERE num=?";
		
		//JDBC 수행 3단계 : PreparedStatement 객체 생성
		pstmt = conn.prepareStatement(sql);
		//?에 데이터 바인딩
		pstmt.setInt(1, num);
		
		//JDBC 수행 4단계 : SQL문을 테이블에 반영하고 결과행을 ResultSet에 담음
		rs = pstmt.executeQuery();
		if (rs.next()) {
			//한 건의 데이터를 읽어오기
			int tnum = rs.getInt("num");
			String name = rs.getString("name");
			String title = rs.getString("title");
			String content = rs.getString("content");
			Date reg_date = rs.getDate("reg_date");
%>
			<div class="page-main-style">
				<h2>글 상세 정보</h2>
				<ul>
					<li>글 번호 : <%= tnum %></li>
					<li>제목 : <%= title %></li>
					<li>작성자 : <%= name %></li>
					<li>작성일 : <%= reg_date %></li>
				</ul>
				<hr width="100%" size="1" noshade="noshade">	<!-- 입체감 없는 선 -->
				<div>
					<%= content %>
				</div>
				<hr width="100%" size="1" noshade="noshade">
				<div class="align-right">
					<!-- get방식으로 PK를 넘김, ex) http://localhost:8080/jspMain2/ch10-jdbc/detailTest.jsp?num=1-->
					<input type="button" value="수정" onclick="location.href='updateTestForm.jsp?num=<%= num %>'">
					<input type="button" value="삭제" onclick="location.href='deleteTestForm.jsp?num=<%= num %>'">
					<input type="button" value="게시판 목록" onclick="location.href='selectTest.jsp'">
				</div>
			</div>
<%			
		} else {
%>
			<div class="result-display">
				글 상세 정보가 없습니다.<br>
				<input type="button" value="게시판 목록" onclick="location.href='selectTest.jsp'">
			</div>
<%
		}
		
	} catch(Exception e) {
		//예외 발생
%>
		<div class="result-display">
			오류 발생! 글 상세 정보 호출 실패!<br>
			<input type="button" value="게시판 목록" onclick="location.href='selectTest.jsp'">
		</div>
<%			
		e.printStackTrace();
	} finally {
		//자원 정리
		if (rs != null) {
			try {rs.close();} catch(SQLException e) {}
		}
		if (pstmt != null) {
			try {pstmt.close();} catch(SQLException e) {}
		}
		if (conn != null) {
			try {conn.close();} catch(SQLException e) {}
		}		
	}
%>
</body>
</html>