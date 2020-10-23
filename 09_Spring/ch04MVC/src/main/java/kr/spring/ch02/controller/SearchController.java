package kr.spring.ch02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SearchController {

	/*
		@RequestParam어노테이션은 HTTP 요청 파라미터를 메소드의 파라미터로 전달
		query는 필수적으로 전달해야 하는 데이터이기 때문에 query 미전달시 오류 발생
		
		@RequestParam(value="query", required=false)
		이와 같이 명시하면 query를 전송하지 않아도 오류가 발생하지 않음
		
		@RequestParam(value="query" defaultValue="")
		이와 같이 명시하면 query를 전송하지 않을 경우 빈문자열("")로 처리
		
		@RequestParam String query
		이와 같이 명시하면 파라미터 네임을 query로 간주함
	*/
	
	@RequestMapping("/search/internal.do")
	public ModelAndView searchInternal(@RequestParam("query") String query,
			@RequestParam(value="p", defaultValue="1") int pageNumber) {
		System.out.println("query = "+query+", pageNumber = "+pageNumber);
		
								//view이름
		return new ModelAndView("search/internal");
	}
	
	//@RequestParam을 생략할 때는 전송된 파라미터 네임명과 메소드의 인자명이 일치해야 전송된 데이터를 받을 수 있음
	@RequestMapping("/search/external.do")
	public ModelAndView searchExternal(String query,
			@RequestParam(value="p", defaultValue="0") int pageNumber) {
		System.out.println("query = "+query+", pageNumber = "+pageNumber);
								//뷰 이름
		return new ModelAndView("search/external");
	}
	
}
/*
	WEB-ING/spring/appServlet-servlet-context.xml 내용
	<beans:property name="prefix" value="/WEB-INF/views/" />
	<beans:property name="suffix" value=".jsp" />
*/