package kr.spring.ch02.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.LocaleResolver;

/*언어 전환*/
@Controller
public class LocaleChangeController {
	@Autowired
	private LocaleResolver localeResolver;	//세션에 언어 정보를 저장
	
	@RequestMapping("/changeLanguage.do")
	public String change(@RequestParam("lang") String language, HttpServletRequest request, HttpServletResponse response) {
		Locale locale = new Locale(language);
		localeResolver.setLocale(request, response, locale);
		
		return "redirect:/index.jsp";
	}
	
}