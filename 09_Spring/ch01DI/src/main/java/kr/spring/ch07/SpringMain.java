package kr.spring.ch07;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//DI 프로퍼티 설정 방식: 여러 개의 프로퍼티가 있는 경우
		SystemMonitor monitor = (SystemMonitor)context.getBean("monitor2");
		System.out.println(monitor);
		
		context.close();
	}
}