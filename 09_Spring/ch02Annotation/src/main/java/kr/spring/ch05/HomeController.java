package kr.spring.ch05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
 	<context:component-scan>태그를 추가하면
 	스프링은 지정한 패키지에서 @Component어노테이션이 적용된 클래스를 검색하여 빈으로 등록
 	
 	자동 등록된 아이디(빈 객체 이름)는 클래스 이름의 첫 글자를 소문자로 바꿔서 사용
 	ex) HomeController의 빈 객체 이름은 homeController
 	
 	빈의 이름을 지정하고 싶으면 @Component("home")와 같이 명시함
 	또는
 	@Component
 	@named("home") 도 가능
*/
//빈 객체로 생성될 예정
@Component
public class HomeController {
	@Autowired
	private Camera camera;

	public void setCamera(Camera camera) {
		this.camera = camera;
	}

	@Override
	public String toString() {
		return "HomeController [camera=" + camera + "]";
	}
	
}