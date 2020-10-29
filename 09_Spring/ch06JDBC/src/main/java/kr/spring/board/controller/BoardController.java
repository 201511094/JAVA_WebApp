package kr.spring.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import kr.spring.board.vo.BoardCommand;

@Controller
public class BoardController {

	//자바빈(VO) 초기화
	@ModelAttribute
	public BoardCommand initCommand() {
		return new BoardCommand();
	}
	
	//글쓰기 폼 호출
	@RequestMapping(value="/insert.do",method=RequestMethod.GET)
	public String form() {
		return "insertForm";
	}
	
	@RequestMapping("/list.do")
	public ModelAndView process() {
		
		ModelAndView mav = new ModelAndView();
		//뷰이름
		mav.setViewName("selectList");
		
		return mav;
	}
	
}