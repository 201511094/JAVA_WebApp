package kr.web.ch01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hundred")
public class HundredServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 [실습] 1부터 100까지의 합 출력(반복문 활용)
		 	출력 예시)
		 	1부터 100까지의 합은 5050
		*/
		
		int result = 0;
		for (int i=1; i<=100; i++) {result += i;}
		
		//컨텐트 타입 및 캐릭터셋 지정
		response.setContentType("text/html; charset=utf-8");
		
		//HTML 출력
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>실습</title></head>");
		out.println("<body>");
		out.println("	1부터 100까지의 합은 " + result);
		out.println("</body>");
		out.println("</html>");
		
		//자원 정리
		out.close();
	}
}