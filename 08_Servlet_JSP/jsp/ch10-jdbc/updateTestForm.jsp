<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.Date" %>
<%@ include file="dbInfo.jspf" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>게시판 글 수정</title>
	<link rel="stylesheet" href="style.css" type="text/css">
	<script type="text/javascript">
		window.onload = function() {
			var myForm = document.getElementById('myForm');
			//이벤트 연결
			myForm.onsubmit = function() {
				var name = document.getElementById('name');
				if (name.value == '') {
					alert('이름을 입력하세요.');
					name.focus();
					return false;
				}
				var title = document.getElementById('title');
				if (title.value == '') {
					alert('제목을 입력하세요.');
					title.focus();
					return false;
				}
				var passwd = document.getElementById('passwd');
				if (passwd.value == '') {
					alert('비밀번호를 입력하세요.');
					passwd.focus();
					return false;
				}
				var content = document.getElementById('content');
				if (content.value == '') {
					alert('내용을 입력하세요.');
					content.focus();
					return false;
				}
			};
			
		};
	</script>
</head>
<body>
	<!-- 한 건의 레코드를 읽어와서 처리 -->
<%
	//전송된 글 번호 반환
	int num = Integer.parseInt(request.getParameter("num"));

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql = null;
	
	try {
		//JDBC 수행 1단계 : 드라이버 로드
		Class.forName(driverName);
	
		//JDBC 수행 2단계 : Connection 객체 생성
		conn = DriverManager.getConnection(jdbcUrl, dbId, dbPass);
	
		//SQL문 작성
		sql = "SELECT * FROM tboard WHERE num=?";
		
		//JDBC 수행 3단계 : PreparedStatement 객체 생성
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, num);
	
		//JDBC 수행 4단계 : SQL문을 테이블에 반영하고 결과행을 ResultSet에 담음
		rs = pstmt.executeQuery();
		
		if (rs.next()) {
			int tnum = rs.getInt("num");
			String name = rs.getString("name");
			String title = rs.getString("title");
			String content = rs.getString("content");
%>
	<div class="page-main-style">
		<h2>글 수정</h2>
		<form id="myForm" action="updateTest.jsp" method="post">
			<input type="hidden" name="num" value="<%= tnum %>">
			<ul>
				<li>
					<label for="name">이름</label>
					<input type="text" id="name" name="name" size="20" maxlength="10" value="<%= name %>">
				</li>
				<li>
					<label for="title">제목</label>
					<input type="text" id="title" name="title" size="30" maxlength="50" value="<%= title %>">
				</li>
				<li>
					<label for="passwd">비밀번호</label>
					<input type="password" id="passwd" name="passwd" size="20" maxlength="10">
				</li>
				<li>
					<label for="content">내용</label>
					<!-- textarea는 닫는 태그가 있으므로 content를 태그 사이의 내용 부분에 넣어줘야 함, 공백 조심 -->
					<textarea rows="5" cols="40" id="content" name="content"><%= content %></textarea>
				</li>
			</ul>
			<div class="align-center">
				<input type="submit" value="전송">
				<input type="button" value="목록" onclick="location.href='selectTest.jsp'">
			</div>
		</form>
	</div>
<%
		} else {
%>
			<div class="result-display">
				수정할 글 정보 호출 실패<br>
				<input type="button" value="게시판 목록" onclick="location.href='selectTest.jsp'">
			</div>
<%			
		}
	} catch(Exception e) {
%>
		<div class="result-display">
			오류 발생! 수정할 글 정보 호출 실패
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