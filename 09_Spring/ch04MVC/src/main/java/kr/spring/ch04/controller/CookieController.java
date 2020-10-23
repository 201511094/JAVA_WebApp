package kr.spring.ch04.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CookieController {

	@RequestMapping("/cookie/make.do")
	public String make(HttpServletResponse response) {
		//쿠키를 생성해서 클라이언트에 전송
		response.addCookie(new Cookie("auth", "1"));
		
		return "cookie/make";
	}
	
	/*
	 	@CookieValue어노테이션을 이용하면 쿠키 값을 파라미터로 전달받을 수 있음
	 	만약 해당 쿠키가 존재하지 않으면 기본적으로 400에러 발생시킴
	 	
	 	@CookieValue(value="auth", required=false)로 지정했을 경우,
	 	해당 쿠기가 존재하지 않으면 null값으로 전달
	 	
	 	@CookieValue(value="auth", defaultValue="0")로 지정했을 경우,
	 	쿠키가 존재하지 않으면 defaultValue에 지정한 값을 전달
	*/
	@RequestMapping("/cookie/view.do")
	public String view(@CookieValue(value="auth", defaultValue="0") String auth) {
		System.out.println("auth 쿠키: "+auth);	//콘솔에 출력
		
		return "cookie/view";
	}
	
}