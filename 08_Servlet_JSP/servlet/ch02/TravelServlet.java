package kr.web.ch02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/travel")
public class TravelServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		  	[실습] 이름을 입력하고 여행지를 선택해서 전송하면 전송한 이름과 여행지를 출력하는 문제
		  		출력예시)
		  		이름 : 홍길동
		  		[여행지]
		  		런던
		  		파리
		*/
		response.setContentType("text/html; charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		String[] cities = request.getParameterValues("city");

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>여행지 선택</title></head>");
		out.println("<body>");
		
		out.println("이름 : " + name + "<br>");
		out.println("[여행지]<br>");
		if (cities != null) {
			for (int i=0; i<cities.length; i++) {
				out.println(cities[i] + "<br>");
			}
		}
		else {
			out.println("선택하지 않음");
		}

		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}
}