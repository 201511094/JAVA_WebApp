<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>리포트 등록 완료</title>
</head>
<body>
	<!-- 원칙은 프로퍼티로 호출, 버전에 따라 메소드로 호출도 가능 -->
	리포트 <b>${ report.subject }</b>을(를) 등록했습니다.<br>
	업로드한 파일명 : ${ report.reportFile.originalFilename }
</body>
</html>