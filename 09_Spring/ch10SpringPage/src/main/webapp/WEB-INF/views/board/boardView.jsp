<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="page-main-style">
	<h2>${ board.title }</h2>
	<ul>
		<li>번호 : ${ board.board_num }</li>
		<li>작성자 : ${ board.id }</li>
		<li>조회수 : ${ board.hit }</li>
		<li>작성일 : ${ board.reg_date }</li>
		<li>최근 수정일 : ${ board.modify_date }</li>
	</ul>
	<hr size="1" width="100%">
	<c:if test="${ !empty board.filename }">
		<div class="align-center">
			<img src="imageView.do?board_num=${ board.board_num }" style="max-width: 500px;">
		</div>
	</c:if>
	<p>
		${ board.content }
	</p>
	<hr size="1" width="100%">
	<div class="align-right">
		<!-- 수정과 삭제는 우선 로그인이 되어 있어야 하고, 로그인한 회원번호와 작성자 회원번호가 일치해야 함 -->
		<c:if test="${ !empty user && user.mem_num == board.mem_num }">
			<input type="button" value="수정" onclick="location.href='update.do?board_num=${board.board_num}'">
			<input type="button" value="삭제" id="delete_btn">
			<script>
				var delete_btn = document.getElementById('delete_btn');
				//이벤트 연결
				delete_btn.onclick = function() {
					var choice = window.confirm('삭제하시겠습니까?');	//그냥 confirm도 ok
					if (choice) {
						location.href='delete.do?board_num=${board.board_num}';	//GET방식으로 보냄
					}
				};
			</script>
		</c:if>
		<input type="button" value="목록" onclick="location.href='list.do'">
	</div>
</div>