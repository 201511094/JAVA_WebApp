package kr.spring.ch08;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//DI 프로퍼티 설정 방식 : XML 네임스페이스를 이용한 프로퍼티 설정
		WorkControl work = (WorkControl)context.getBean("work");
		System.out.println(work);
		
		context.close();
	}
}