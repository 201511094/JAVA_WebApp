package kr.spring.ch01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.spring.ch01.model.LoginCommand;
import kr.spring.ch01.service.LoginCheckException;
import kr.spring.ch01.service.LoginService;
import kr.spring.ch01.validator.LoginCommandValidator;

@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;	//주입
	
	//자바빈(VO) 초기화
	@ModelAttribute("login")
	public LoginCommand initCommand() {
		return new LoginCommand();
	}
	
	@RequestMapping(value="/login/login.do", method=RequestMethod.GET)
	public String form() {
		return "loginForm";
	}
	
	@RequestMapping(value="/login/login.do", method=RequestMethod.POST)
	public String submit(@ModelAttribute("login") LoginCommand loginCommand, BindingResult result) {
		//유효성 체크
		new LoginCommandValidator().validate(loginCommand, result);
		
		//유효성 체크 결과 오류가 있으면 폼 호출
		if (result.hasErrors()) {
			return form();
		}
		
		//로그인 체크
		try {
			loginService.checkLogin(loginCommand);
			
			return "redirect:/index.jsp";
		} catch (LoginCheckException e) {
			e.printStackTrace();
			//에러 메시지 지정
			result.reject("invalidIdOrPassword");
			
			return form();
		}
	}
	
}