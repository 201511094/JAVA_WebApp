package kr.web.ch02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/todayMenu")
public class TodayMenu extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html; charset=utf-8");
		
		request.setCharacterEncoding("utf-8");

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>점심 메뉴</title></head>");
		out.println("<body>");
		out.println("<h3>오늘 점심</h3>");
		
		//체크박스로 점심메뉴를 여러 개 선택		
		//하나의 name에 대해 여러 개의 value -> 배열
		String[] values = request.getParameterValues("lunch");
		
		if (values != null) {
			for (int i=0; i<values.length; i++) {
				out.println(values[i] + "<br>");
			}
		}
		//전송한 데이터가 없는 경우
		else {
			out.println("선택하지 않음");
		}
		
		out.println("</body>");
		out.println("</html>");
	
		out.close();
	}
}