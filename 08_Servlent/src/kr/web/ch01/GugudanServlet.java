package kr.web.ch01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/gugudan")
public class GugudanServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//컨텐트 타입 및 캐릭터셋 지정
		response.setContentType("text/html; charset=utf-8");
		
		//입력받은 구구단 단의 값은 request에 들어있음
		//전송받은 단을 반환 String -> int
		//*중요* Integer.parseInt()
		int dan = Integer.parseInt(request.getParameter("dan"));
				
		//출력 스트림 생성
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>구구단</title></head>");
		out.println("<body>");
		
		out.println(dan + "단<br>");
		out.println("----------<br>");
		for (int i=1; i<10; i++) {
			out.println(dan + " * " + i + " = " + dan*i + "<br>");
		}
		
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}
	/*
		gugu.html을 먼저 실행한 후 Servlet을 실행해야 함
	 
		get방식으로 전송
		http://localhost:8080/servletMain/gugudan?dan=9
	*/
}