package kr.spring.ch11;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Set 타입 프로퍼티 설정
		VideoClient video = (VideoClient)context.getBean("videoClient");
		System.out.println(video);
		
		context.close();
	}
}