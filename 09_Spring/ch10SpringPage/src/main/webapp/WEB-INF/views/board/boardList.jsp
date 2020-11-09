<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="page-main-style">
	<h2>게시판 목록</h2>
	<form action="list.do" id="search_form" method="get">	<!-- 자기 자신을 호출 -->
		<ul class="search">
			<li>
				<select name="keyfield" id="keyfield">
					<option value="title">제목</option>
					<option value="id">ID</option>
					<option value="content">내용</option>
					<option value="all">전체</option>
				</select>
			</li>
			<li>
				<input type="text" name="keyword" id="keyword">
			</li>
			<li>
				<input type="submit" value="찾기">
				<input type="button" value="목록" onclick="location.href='list.do'">
			</li>
		</ul>
	</form>
	
	<div class="align-right">
		<c:if test="${ !empty user }">
			<!-- 로그인이 되어 있으면 글쓰기 버튼이 보여짐 -->
			<input type="button" value="글쓰기" onclick="location.href='write.do'">
		</c:if>
	</div>
	
	<c:if test="${ count == 0 }">
		<div class="align-center">등록된 게시물이 없습니다.</div>
	</c:if>
	<c:if test="${ count > 0 }">
		<table>
			<tr>
				<th>번호</th>
				<th width="400">제목</th>
				<th>작성자</th>
				<th>최근수정일</th>
				<th>조회수</th>
			</tr>
			<c:forEach var="board" items="${ list }">
				<tr>
					<td>${ board.board_num }</td>
					<td><a href="detail.do?board_num=${ board.board_num }">${ board.title }</a></td>
					<td>${ board.id }</td>
					<td>${ board.modify_date }</td>
					<td>${ board.hit }</td>
				</tr>
			</c:forEach>
		</table>
		<div class="align-center">${ pagingHtml }</div>
	</c:if>
</div>