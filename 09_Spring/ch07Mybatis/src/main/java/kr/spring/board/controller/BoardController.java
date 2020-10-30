package kr.spring.board.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.spring.board.service.BoardService;
import kr.spring.board.vo.BoardCommand;
import kr.spring.util.PagingUtil;

@Controller
public class BoardController {
	
	@Resource
	private BoardService boardService;
	
	//로그 처리(로그 대상 지정)
	private Logger log = Logger.getLogger(this.getClass());
	
	//자바빈(VO) 초기화
	@ModelAttribute
	public BoardCommand initCommand() {
		return new BoardCommand();
	}
	
	@RequestMapping("/list.do")
	public ModelAndView getList(@RequestParam(value="pageNum", defaultValue="1") int currentPage) {
		//총 레코드 수
		int count = boardService.getBoardCount();
		
		//페이징 처리
		PagingUtil page = new PagingUtil(currentPage, count, 10, 10, "list.do");
		
		//목록 호출
		List<BoardCommand> list = null;
		if (count > 0) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("start", page.getStartCount());
			map.put("end", page.getEndCount());
			
			//리스트 호출
			list = boardService.getBoardList(map);
		}
		
		ModelAndView mav = new ModelAndView();
		//뷰 이름 설정
		mav.setViewName("selectList");
		//데이터 저장
		mav.addObject("count", count);
		mav.addObject("list", list);
		//페이징 처리
		mav.addObject("pagingHtml", page.getPagingHtml());
		
		return mav;
	}
	
	//글쓰기 폼
	@RequestMapping(value="/insert.do", method=RequestMethod.GET)
	public String form() {
		return "insertForm";
	}
	
	//글쓰기 처리
	@RequestMapping(value="/insert.do", method=RequestMethod.POST)
	public String submit(@Valid BoardCommand boardCommand, BindingResult result) {
		//유효성 체크 결과 오류가 있으면 폼 호출
		if (result.hasErrors()) {
			return form();
		}
		
		//글쓰기
		boardService.insertBoard(boardCommand);
		
		return "redirect:/list.do";
	}
	
	//글 수정
	//@RequestMapping(value="/update.do", method=RequestMethod.GET)


	
	//글 삭제
	
	
	
	
}