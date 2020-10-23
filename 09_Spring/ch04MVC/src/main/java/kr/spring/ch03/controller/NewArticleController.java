package kr.spring.ch03.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.spring.ch03.model.NewArticleCommand;
import kr.spring.ch03.service.ArticleService;

@Controller
@RequestMapping("/article/newArticle.do")
public class NewArticleController {
	@Resource
	private ArticleService articleService;
	
	
	public void setArticleService(ArticleService articleService) {
		this.articleService = articleService;
	}

	@RequestMapping(method=RequestMethod.GET)
	public String form() {
		return "article/newArticleForm";
	}
	
	/*
	 	전송된 데이터를 request에서 반환받아서 자바빈(VO)에 넣을 경우,
	 	호출되는 메소드의 인자 앞에 @ModelAttribute를 명시하고 인자를 NewArticleCommand command로 기재하면
	 	생성된 자바빈에 전송된 데이터를 저장해서 인자에 전달함
	 	@ModelAttribute("command")로 기재하면 command는 속성명과 자바빈을 속성값으로 request에 저장함
	 	
	 	@ModelAttribute만 기재하고 속성명을 표시하지 않으면
	 	자바빈 명칭의 앞을 소문자해서 속성명을 지정
	 	ex) NewArticleCommand -> newArticleCommand
	 	
	 	@ModelAttribute를 생략하고 NewArticleCommand command만 기재해도 자바빈 객체를 사용할 수 있음
	*/
	@RequestMapping(method=RequestMethod.POST)
	public String submit(NewArticleCommand command) {
		articleService.writeArticle(command);
		
		return "article/newArticleSubmitted";
	}
	
}