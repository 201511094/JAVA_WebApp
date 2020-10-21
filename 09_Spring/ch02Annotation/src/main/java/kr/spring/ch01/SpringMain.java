package kr.spring.ch01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//@Required 어노테이션을 이용한 필수 프로퍼티 설정
		Camera camera = (Camera)context.getBean("camera1");
		System.out.println(camera);
		
		context.close();
	}
}