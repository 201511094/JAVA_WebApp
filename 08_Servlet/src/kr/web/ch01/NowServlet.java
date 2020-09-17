package kr.web.ch01;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//어노테이션을 이용한 주소 매핑
@WebServlet("/now")
public class NowServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//문서 타입 및 캐릭터셋 지정
		response.setContentType("text/html; charset=utf-8");
		
		//날짜는 영문포맷이므로 SimpleDateFormat을 이용하여 형식 지정
		Date now = new Date();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy년MM월dd일 a hh:mm:ss");
		
		//HTML 출력을 위한 출력 스트림 생성
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>현재 날짜와 시간</title></head>");
		out.println("<body>");
		out.println("현재 날짜와 시간: " + sf.format(now));
		out.println("</body>");
		out.println("</html>");
		
		//출력 스트림 자원 정리
		out.close();
	}
}