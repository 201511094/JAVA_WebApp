package kr.spring.ch04;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//@Resource어노테이션을 이용한 프로퍼티 설정
		//각각의 bean의 id값과 프로퍼티의 값이 다르기 때문에 타입이 같은 객체가 여러 개 존재해도 오류가 발생하지 않음
		HomeController home = (HomeController)context.getBean("homeController");
		System.out.println(home);	//toString()이 실행됨
		
		context.close();
	}
}