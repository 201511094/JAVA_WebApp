package kr.web.ch01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
			views폴더에 add.html 저장,
			정수 2개를 입력 받아서 서블릿에 전송
			전송된 정수 2개를 반환 받아서 덧셈하고 출력
			
			출력예시)
			3 + 4 = 7
		*/
		int num1, num2, result;
		num1 = Integer.parseInt(request.getParameter("num1"));
		num2 = Integer.parseInt(request.getParameter("num2"));
		result = num1 + num2;
		
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>덧셈</title></head>");
		out.println("<body>");
		out.println(num1 + " + " + num2 + " = " + result);
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}
	/*
	 	http://localhost:8080/servletMain/add?num1=3&num2=4
	 	
	*/
}