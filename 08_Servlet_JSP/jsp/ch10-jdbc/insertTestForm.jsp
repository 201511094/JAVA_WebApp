<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>게시판 등록</title>
	<link rel="stylesheet" href="style.css" type="text/css">
	<script type="text/javascript">
		window.onload = function() {
			var myForm = document.getElementById('myForm');
			//이벤트 연결
			//onsubmit일 때 return false 필수! 현재 이벤트를 제거
			myForm.onsubmit = function() {
				var name = document.getElementById('name');
				if (name.value == '') {
					alert('이름을 입력하세요.');
					name.focus();
					return false;	//submit이 안되도록 false를 리턴
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
	<div class="page-main-style">
		<h2>글쓰기</h2>
		<!-- 전송 방식은 반드시 post -->
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