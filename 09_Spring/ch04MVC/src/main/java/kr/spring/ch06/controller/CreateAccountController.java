package kr.spring.ch06.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.spring.ch06.model.MemberInfo;
import kr.spring.ch06.validator.MemberInfoValidator;

@Controller
@RequestMapping("/account/create.do")
public class CreateAccountController {
	
	//자바빈(VO) 초기화, Command객체 초기화 --> 자바빈=VO=Command
	@ModelAttribute("command")
	public MemberInfo initCommand() {
		//빈 자바빈 객체 반환 -> request에 저장됨
		return new MemberInfo();
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String form() {
		//GET방식일 경우 form으로 진입
		return "account/creationForm";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String submit(@ModelAttribute("command") MemberInfo memberInfo, BindingResult result) {
		System.out.println("전송된 데이터: " + memberInfo);	//콘솔에 표시
		
		//BindingResult에는 에러 정보가 담겨있음
		//전송된 데이터에 대한 유효성 체크
		new MemberInfoValidator().validate(memberInfo, result);
		
		//BindingResult객체인 result에 유효성 체크 결과 오류에 대한 내용이 저장되어 있으면 form을 다시 호출함
		if (result.hasErrors()) {
			return "account/creationForm";
		}
		
		return "account/created";
	}
}