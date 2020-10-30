package kr.spring.board.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kr.spring.board.service.BoardService;
import kr.spring.board.validator.BoardValidator;
import kr.spring.board.vo.BoardCommand;
import kr.spring.util.PagingUtil;

@Controller
public class BoardController {
	@Resource
	private BoardService boardService;
	
	//로그 처리(로그 대상 지정)
	private Logger log = Logger.getLogger(this.getClass());
	/* 
	 	로그 레벨
	 	FATAL : 가장 심각한 오류
	 	ERROR : 일반적인 오류
	 	WARN : 주의를 요하는 경우, 오류는 아님
	 	INFO : 런타임시 관심 있는 내용을 표시
	 	DEBUG : 시스템 흐름과 관련된 상세 정보
	 	TRACE : 가장 상세한 정보
	*/
	
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

	//글쓰기 전송된 데이터 처리
	@RequestMapping(value="/insert.do", method=RequestMethod.POST)
	public String submit(BoardCommand boardCommand, BindingResult result) {
		//유효성 체크
		new BoardValidator().validate(boardCommand, result);
		//유효성 체크 결과 오류가 있으면 폼 호출
		if (result.hasErrors()) {
			return form();
		}
		
		//글 등록
		boardService.insertBoard(boardCommand);
		
		return "redirect:/list.do";
	}
	
	@RequestMapping("/list.do")
	public ModelAndView process(@RequestParam(value="pageNum", defaultValue="1") int currentPage) {
		int count = boardService.getBoardCount();
		
		//페이징 처리
		PagingUtil page = new PagingUtil(currentPage, count, 10, 10, "list.do");
		
		//목록 불러오기
		List<BoardCommand> list = null;
		if (count > 0) {
			list = boardService.getBoardList(page.getStartCount(), page.getEndCount());
		}
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("selectList");	//뷰 이름
		//데이터 저장
		mav.addObject("count", count);
		mav.addObject("list", list);
		mav.addObject("pagingHtml", page.getPagingHtml());
		
		return mav;
	}
	
	//글 상세 정보
	@RequestMapping("/detail.do")
	public ModelAndView detail(@RequestParam int num) {
		//로그 처리
		if (log.isDebugEnabled()) {
			//로그 레벨이 디버그이면
			log.debug("<<num: "+num + ">>");
		}
		
		BoardCommand board = boardService.getBoard(num);
		
		//뷰 이름, 속성명, 속성값
		return new ModelAndView("selectDetail", "board", board);
	}
	
	//글 수정 폼
	@RequestMapping(value="/update.do", method=RequestMethod.GET)
	public String formUpdate(@RequestParam int num, Model model) {
		BoardCommand boardCommand = boardService.getBoard(num);
		
		//로그 처리
		if (log.isDebugEnabled()) {
			log.debug("<<BoardCommand: "+ boardCommand + ">>");
		}
		model.addAttribute("boardCommand", boardCommand);
		
		return "updateForm";
	}
	
	@RequestMapping(value="/update.do", method=RequestMethod.POST)
	public String submitUpdate(BoardCommand boardCommand, BindingResult result) {
		//유효성 체크
		new BoardValidator().validate(boardCommand, result);
		//유효성 체크 결과 오류가 있으면 폼 호출
		if (result.hasErrors()) {
			return "updateForm";
		}
		
		//비밀번호 일치 여부 체크
		//DB에 저장된 비밀번호 구하기
		BoardCommand dbBoard = boardService.getBoard(boardCommand.getNum());
		//비밀번호 체크
		if (!dbBoard.getPasswd().equals(boardCommand.getPasswd())) {
			result.rejectValue("passwd", "invalidPassword");	//필드, 에러코드
			return "updateForm";
		}
		
		//글 수정
		boardService.updateBoard(boardCommand);	
		
		return "redirect:/list.do";
	}
	
	//글 삭제 폼
	@RequestMapping(value="/delete.do", method=RequestMethod.GET)
	public String formDelete(@RequestParam int num, Model model) {
		BoardCommand boardCommand = new BoardCommand();
		boardCommand.setNum(num);
		
		//Model에 저장된 데이터는 request에도 저장됨
		model.addAttribute("boardCommand", boardCommand);
		
		return "deleteForm";
	}
	
	//글 삭제 처리
	@RequestMapping(value="/delete.do", method=RequestMethod.POST)
	public String submitDelete(BoardCommand boardCommand, BindingResult result) {
		//유효성 체크
		new BoardValidator().validate(boardCommand, result);
		//유효성 체크 결과 오류가 있으면 폼을 호출
		//비밀번호의 전송 여부만 체크! 원래 4개가 전송되지만 비밀번호만 필요하므로
		if (result.hasFieldErrors("passwd")) {
			return "deleteForm";
		}
		
		//비밀번호 일치 여부 체크
		//DB에 저장된 비밀번호 구하기
		BoardCommand dbBoard = boardService.getBoard(boardCommand.getNum());
		if (!dbBoard.getPasswd().equals(boardCommand.getPasswd())) {
			result.rejectValue("passwd", "invalidPassword");
			
			return "deleteForm";
		}
		
		//글 삭제
		boardService.deleteBoard(boardCommand.getNum());
		
		return "redirect:/list.do";
	}
	
}
/*
 	ModelAndView는 모델과 뷰를 동시에 저장하지만 Model은 데이터만 저장함 
*/