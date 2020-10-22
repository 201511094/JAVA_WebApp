package kr.spring.ch01.pojo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.spring.product.Product;

public class SpringMain {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//핵심 기능 실행
		Product p = (Product)context.getBean("product");
		p.launch();
		
		context.close();
	}
}