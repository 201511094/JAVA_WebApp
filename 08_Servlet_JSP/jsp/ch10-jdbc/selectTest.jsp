<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Date" %>	<%-- 자바-DB연결할 때 사용하는 클래스 --%>
<%@ include file="dbInfo.jspf" %>	<%-- jsp파일에 dbInfo.jspf를 삽입해서 변수 공유 --%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>게시판 목록</title>	<!-- 메인화면 -->
	<link rel="stylesheet" href="style.css" type="text/css">
</head>
<body>
	<div class="page-main-style">
		<h2>게시판 목록</h2>
		<div class="align-right">
			<input type="button" value="글쓰기" onclick="location.href='insertTestForm.jsp'">
		</div>
		<table>
			<tr>
				<th>글번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
			</tr>
		<% 	
			Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			String sql = null;
			
			try {
				//JDBC 수행 1단계 : 드라이버 로드
				Class.forName(driverName);
				//JDBC 수행 2단계 : Connection 객체 생성(ID와 비밀번호로 인증)
				conn = DriverManager.getConnection(jdbcUrl, dbId, dbPass);
			
				//SQL문 작성
				sql = "SELECT * FROM tboard ORDER BY num DESC";	//내림차순, 최신글이 가장 위로

				//JDBC 수행 3단계 : PreparedStatement 객체 생성
				pstmt = conn.prepareStatement(sql);
				
				//JDBC 수행 4단계 : SQL문을 테이블에 반영하고 결과행을 ResultSet에 담음
				rs = pstmt.executeQuery();	//행 단위로 담겨있음
				//커서가 움직이면서 한 행씩 탐색
				while (rs.next()) {
					//한 행에 대한 정보
					int num = rs.getInt("num");
					String name = rs.getString("name");
					String title = rs.getString("title");
					Date reg_date = rs.getDate("reg_date");
		%>
					<tr>
						<td><%= num %></td>
						<!-- get방식으로 PK를 넘겨서 상세 페이지로 이동 -->
						<!-- ex) http://localhost:8080/jspMain2/ch10-jdbc/detailTest.jsp?num=1 -->
						<td><a href="detailTest.jsp?num=<%= num %>"><%= title %></a></td>
						<td><%= name %></td>
						<td><%= reg_date %></td>
					</tr>
		<%
				}
			} catch(Exception e) {
				//예외 발생
		%>
				<tr>
					<!-- 네 칸 합치기 -->
					<td colspan="4" class="align_center">오류 발생!</td>
				</tr>
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
		</table>
	</div>
</body>
</html>