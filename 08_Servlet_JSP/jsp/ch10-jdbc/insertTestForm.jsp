<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>게시판 등록</title>
</head>
<body>
	<div class="page-main-style">
		<h2>글쓰기</h2>
		<form id="myForm" action="insertTest.jsp" method="post">
			<ul>
				<li>
					<label for="name">이름</label>
					<!-- size는 보이는 크기,  한글을 3byte로 처리할 경우를 생각해 maxlength는 10으로 -->
					<input type="text" id="name" name="name" size="20" maxlength="10">
				</li>
				<li>
					<label for="title">제목</label>
					<input type="text" id="title" name="title" size="30" maxlength="50">
				</li>
				<li>
					<label for="passwd">비밀번호</label>
					<input type="password" id="passwd" name="passwd" size="20" maxlength="10">
				</li>
				<li>
					<label for="content">내용</label>
					<textarea rows="5" cols="40" id="content" name="content"></textarea>
				</li>
			</ul>
			<div class="align-center">
				<input type="submit" value="전송">
				<input type="button" value="목록" onclick="location.href='selectTest.jsp'">
			</div>
		</form>
	</div>
</body>
</html>