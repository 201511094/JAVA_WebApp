package kr.spring.ch07.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.spring.ch07.model.LoginCommand;
import kr.spring.ch07.service.LoginCheckException;
import kr.spring.ch07.service.LoginService;
import kr.spring.ch07.validator.LoginCommandValidator;

@Controller
@RequestMapping("/login/login.do")
public class LoginController {
	@Resource
	private LoginService loginService;
	
	//자바빈(VO) 초기화 -> 자동으로 loginCommand
	//form:form 연결을 위해 자바빈 초기화가 반드시 필요
	@ModelAttribute
	public LoginCommand initCommand() {
		
		return new LoginCommand();
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String form() {
		
		return "login/form";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String submit(LoginCommand loginCommand, BindingResult result) {
		//전송된 데이터 유효성 체크
		new LoginCommandValidator().validate(loginCommand, result);
		
		//유효성 체크 결과 오류가 있으면 폼을 호출
		if (result.hasErrors()) {
			return form();
		}
		
		//로그인 체크
		try {
			loginService.checkLogin(loginCommand);
			
			//정상적인 경우
			return "redirect:/index.jsp";
			
		} catch (LoginCheckException e) {
			//필드 없이 에러 코드를 만들 때는 reject를 사용, 에러코드 이름은 invalidIdOrPassword
			result.reject("invalidIdOrPassword");
			
			return form();
		}
		
		
	}
	
}