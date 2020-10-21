package kr.spring.ch15;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		//서로 다른 범위 빈에 대한 의존 처리
		Executor executor = (Executor)context.getBean("executor");
		System.out.println(executor+", "+executor.getWorker());
		System.out.println("==========");
		
		Executor executor2 = (Executor)context.getBean("executor");
		System.out.println(executor2+", "+executor2.getWorker());
	}
}