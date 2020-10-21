package kr.spring.ch03;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		//Error발생 -> expected single matching bean but found 2: recorder1,recorder2
		//해결 -> @Qualifier어노테이션으로 식별자 부여
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		SystemMonitor2 monitor = (SystemMonitor2)context.getBean("systemMonitor");
		System.out.println(monitor.getRecorder());
		
		context.close();
	}
}