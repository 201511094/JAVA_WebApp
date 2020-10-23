package kr.spring.ch05.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.spring.ch05.model.SearchCommand;
import kr.spring.ch05.service.SearchService;

@Controller
public class GameSearchController {
	
	//주입받기
	@Resource
	private SearchService searchService;
	
	@RequestMapping("/search/main.do")
	public String main() {
		
		return "search/main";
	}
	
	//전송된 데이터를 자바빈(SearchCommand)에 담음
	//type과 query가 전송되어 request에 담겨있음
	@RequestMapping("/search/game.do")
	public ModelAndView search(@ModelAttribute("command") SearchCommand command) {
		String result = searchService.search(command);
		
		ModelAndView mav = new ModelAndView();
		//뷰 이름 지정
		mav.setViewName("search/game");
		//데이터 지정
		mav.addObject("searchResult", result);
		
		return mav;
	}
	
}