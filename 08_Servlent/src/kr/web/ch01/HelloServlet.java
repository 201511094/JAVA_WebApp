package kr.web.ch01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;	//HttpServlet을 상속
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//서블릿은 HttpServlet을 상속해야 사용 가능
public class HelloServlet extends HttpServlet {
	
	//클라이언트가 요청하면 HelloServlet 객체가 생성되고 doGet()메서드가 호출됨
	public void doGet(HttpServletRequest request, HttpServletResponse response)
					throws ServletException, IOException {
		
		//문서 타입 및 캐릭터셋 지정
		//타입은 큰 범주에서 text, 작은 범주에서 html
		//charset지정을 안하면 한글이 깨짐
		response.setContentType("text/html;charset=utf-8");
		
		//HTML 출력을 위한 출력 스트림 생성
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>First Servlet</title></head>");
		out.println("<body>");
		out.println("처음 작성하는 servlet입니다.");
		out.println("</body>");
		out.println("</html>");
		
		//출력 스트림 자원 정리
		out.close();
	}
	/*
	 	주소 매핑 전,
	 	http://localhost:8080/servletMain/servlet/kr.web.ch01.HelloServlet
	 	주소창에 주소가 다 공개됨, 내부 구조를 다 알려준다는 면에서 보안에 취약
	 	
	 	web.xml에 주소 매핑 후,
	 	http://localhost:8080/servletMain/helloServlet
	*/
}