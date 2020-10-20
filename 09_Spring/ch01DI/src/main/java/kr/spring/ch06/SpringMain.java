package kr.spring.ch06;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//DI 프로퍼티 설정 방식
		RegisterService service = (RegisterService)context.getBean("registerService");
		service.write();
		
		context.close();
	}
}