<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>쿠키 삭제</title>
</head>
<body>
<%
	Cookie[] cookies = request.getCookies();
	if (cookies!=null && cookies.length > 0){
		for (int i=0; i<cookies.length; i++){
			if (cookies[i].getName().equals("name")){
				//name이라는 쿠키명을 갖는 쿠키 객체 생성
				Cookie cookie = new Cookie("name","");
				//쿠키 정보 제거
				cookie.setMaxAge(0);
				
				//생성된 쿠키를 클라이언트로 전송
				response.addCookie(cookie);
				
				out.println("name 쿠키를 삭제합니다.");
			}
		}
	}
	else {
		out.println("쿠키가 존재하지 않습니다.");
	}
%>
</body>
</html>






