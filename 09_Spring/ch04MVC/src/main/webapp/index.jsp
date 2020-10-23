<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Spring</title>
</head>
<body>
	<a href="${ pageContext.request.contextPath }/hello.do">HelloController</a><br>
	<!-- SearchController-internal은 get방식, query 미전달시 에러 발생! Required String parameter 'query' is not present -->
	<a href="${ pageContext.request.contextPath }/search/internal.do?query=Seoul&p=10">SearchController - internal.do</a><br>
	<a href="${ pageContext.request.contextPath }/search/external.do?query=Busan">SearchController - external.do</a><br>
	<a href="${ pageContext.request.contextPath }/article/newArticle.do">NewArticleController</a><br>
	<a href="${ pageContext.request.contextPath }/cookie/make.do">CookieController - make.do</a><br>
	<a href="${ pageContext.request.contextPath }/cookie/view.do">CookieController - view.do</a><br>
	<a href="${ pageContext.request.contextPath }/search/main.do">GameSearchController</a><br>
</body>
</html>