package kr.spring.ch01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//요청에 의해 호출되는 모델 클래스(Controller)로 사용하려면 반드시 @Controller를 명시해야 함
@Controller
public class HelloController {

	@RequestMapping("/hello.do")
	public ModelAndView hello() {
		ModelAndView mav = new ModelAndView();
		
		//뷰 이름 지정
		mav.setViewName("hello");
		//뷰에서 사용할 데이터 세팅
		mav.addObject("greeting", "안녕하세요");
			
		return mav;	//DispatcherServlet에 전달됨
	}
	
}
/*
	스프링 MVC
	1. 클라이언트는 DispatcherServlet에 처리 요청(URL)
	2. DispatcherServlet는 요청 URL과 매핑되는 Controller 검색
	3. HandlerMapping은 검색된 Controller를  DispatcherServlet에 리턴
	4. DispatcherServlet는 Controller에 처리를 요청
	5. Controller는 DispatcherServlet에 ModelAndView를 리턴
	6. DispatcherServlet는 ViewResolver로 Controller의 실행 결과를 보여줄 View를 검색
	7. ViewResolver는 검색된 View를 DispatcherServlet에 리턴
	8. DispatcherServlet는 View에 응답 출력 요청
*/