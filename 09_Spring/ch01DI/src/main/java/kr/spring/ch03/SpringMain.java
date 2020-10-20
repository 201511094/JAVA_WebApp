package kr.spring.ch03;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		/*
			applicationContext.xml 설정 파일을 읽어들여
			스프링(IoC) 컨테이너를 생성
		*/
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//원하는 객체를 컨테이너로부터 읽어들임
		PeopleBean peopleBean = (PeopleBean)context.getBean("peopleBean");
		peopleBean.eat("사과");
		
		//어플리케이션 종료 시 컨테이너에 존재하는 모든 빈(객체)를 종료
		context.close();
	}

}