<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="page-main-style">
	<h2>게시판 목록</h2>
	<div class="align-right">
		<c:if test="${ !empty user }">
			<!-- 로그인이 되어 있으면 글쓰기 버튼이 보여짐 -->
			<input type="button" value="글쓰기" onclick="location.href='write.do'">
		</c:if>
	</div>
</div>