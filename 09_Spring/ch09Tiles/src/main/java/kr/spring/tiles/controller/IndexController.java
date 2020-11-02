package kr.spring.tiles.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/index.do")
	public String getIndex() {
		//뷰 이름: tiles의 설정 파일인 tilesdef.xml의 definition 이름
		//index.jsp가 아니라 id가 index인 것
		return "index";
	}
	
	@RequestMapping("/menu1.do")
	public String getMenu1() {
		return "menu1";
	}
	
	@RequestMapping("/menu2.do")
	public String getMenu2() {
		return "menu2";
	}
	
}
/*
 	스프링 프레임워크 tiles 설정
 	- 웹 페이지에서 반복적으로 사용되는 부분들의 정보를 모아서 관리
 	- 주로 반복되는 페이지 상단, 하단, header, footer 등
	1) pom.xml에 tiles 선언 -> 관련 dependency 추가
	2) servlet-context.xml파일에 tiles 선언 -> 타일즈 View Resolver 를 추가
	3) tiles 관련 설정 xml파일 생성 -> tilesdef.xml
	4) tiles관련 jsp파일 생성 -> 기본 레이아웃 .jsp파일들
*/