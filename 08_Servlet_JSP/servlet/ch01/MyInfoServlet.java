package kr.web.ch01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/myInfo")
public class MyInfoServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 [실습] 개인정보 출력하기
		 	데이터를 저장할 변수를 지정 (name, age, job, address)
		 	지정된 변수에 값을 저장한 후 body에서 아래와 같이 변수 호출
		 	출력예시)
		 	이름 : 홍길동
		 	나이 : 20살
		 	직업 : 학생
		 	주소 : 서울시
		*/
		
//		Person p = new Person();
//		p.name = "홍길동";
//		p.age = 20;
//		p.job = "학생";
//		p.address = "서울시";
		Person p = new Person("홍길동", 20, "학생", "서울시");
		
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head><title>실습</title></head>");
		out.println("<body>");
		out.println("	이름 : "+ p.name + "<br>");
		out.println("	나이 : "+ p.age + "살<br>");
		out.println("	직업 : "+ p.job + "<br>");
		out.println("	주소 : "+ p.address);
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}
}

class Person {
	String name;
	int age;
	String job;
	String address;
	
	Person (String name, int age, String job, String address) {
		this.name=name;
		this.age=age;
		this.job=job;
		this.address=address;
	}
	
}