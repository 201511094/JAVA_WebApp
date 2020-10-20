package kr.spring.ch13;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		//프로퍼티 이름을 이용한 의존 관계 자동 설정
		WriteArticleService articleService = (WriteArticleService)context.getBean("writeArticleService");
		articleService.write();
		
		context.close();
	}
}