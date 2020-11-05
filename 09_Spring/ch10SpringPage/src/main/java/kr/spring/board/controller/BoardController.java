package kr.spring.board.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.spring.board.service.BoardService;

@Controller
public class BoardController {
	private Logger log = Logger.getLogger(this.getClass());
	@Resource BoardService boardService;
	
	//게시판 목록
	@RequestMapping("/board/list.do")
	public ModelAndView process() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("boardList");
		
		return mav;
	}
	
}