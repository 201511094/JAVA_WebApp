package kr.spring.ch09.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.spring.ch09.model.MemberCommand;

@Controller
public class MemberWriteController {
	
	//자바빈(VO) 초기화
	@ModelAttribute("command")	//request에 command라는 이름으로 저장됨
	public MemberCommand initCommand() {
		
		return new MemberCommand();
	}
	
	@RequestMapping(value="/member/write.do", method=RequestMethod.GET)
	public String form() {
		
		return "member/write";
	}
	
	@RequestMapping(value="/member/write.do", method=RequestMethod.POST)
	//@Valid는 MemberCommand의 유효성 체크를 수행
	public String submit(@ModelAttribute("command") @Valid MemberCommand memberCommand, BindingResult result) {
		
		System.out.println(memberCommand);
		
		//유효성 체크 결과 오류가 있으면 폼 호출
		if (result.hasErrors()) {
			return "member/write";
		}
		
		return "redirect:/index.jsp";
	}
	
}