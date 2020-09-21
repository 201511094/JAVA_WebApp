package kr.web.ch02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/greeting")
public class GreetingServlet extends HttpServlet {
	//Get방식은 doGet(), Post방식은 doPost()
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//문서 타입 및 캐릭터셋 지정
		response.setContentType("text/html; charset=utf-8");
		
		//전송된 데이터 인코딩 처리
		//Get방식과 달리 Post방식은 데이터를 뽑아내기 전에 인코딩 처리가 필요
		request.setCharacterEncoding("utf-8");
		
		//전송된 데이터 반환
		String name = request.getParameter("name");
		
		//출력 스트림 생성
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>Greeting</title></head>");
		out.println("<body>");
		out.println(name + "님의 방문을 환영합니다.");
		out.println("</body>");
		out.println("</html>");
		
		//자원 정리
		out.close();
	}
	/*
	 	Get방식
	 	http://localhost:8080/servletMain/greeting?name=%ED%99%8D%EA%B8%B8%EB%8F%99
	 	요청라인에 데이터를 넣어서 보냄
	 	
	 	Post방식
	 	http://localhost:8080/servletMain/greeting
	 	body에 데이터를 넣어서 보냄
	*/
}