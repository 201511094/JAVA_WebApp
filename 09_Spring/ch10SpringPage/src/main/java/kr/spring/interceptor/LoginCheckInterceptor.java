package kr.spring.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

//Interceptor는 요청을 낚아챔
//HandlerInterceptorAdapter는 주어진 요청보다 먼저 실행되도록 함
public class LoginCheckInterceptor extends HandlerInterceptorAdapter {
	private Logger log = Logger.getLogger(this.getClass());

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		
		if (log.isDebugEnabled()) {
			//myPage.do 실행되기 전
			log.debug("=== LoginCheckInterceptor진입 ===");
		}
		
		//로그인 여부 검사
		HttpSession session = request.getSession();
		if (session.getAttribute("user") == null) {
			//로그인이 되지 않은 상태일 때 회원상세정보(myPage.do)로 이동할 경우 로그인 페이지가 뜨게 함
			response.sendRedirect(request.getContextPath()+"/member/login.do");
		
			return false;
		}
		
		return true;
	}
	
}