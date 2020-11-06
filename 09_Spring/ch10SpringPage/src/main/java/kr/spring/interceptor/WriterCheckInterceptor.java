package kr.spring.interceptor;

import javax.annotation.Resource;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import kr.spring.board.service.BoardService;
import kr.spring.board.vo.BoardVO;
import kr.spring.member.vo.MemberVO;

//요청을 낚아챔, 요청이 수행되기 전에 호출
public class WriterCheckInterceptor extends HandlerInterceptorAdapter {
	private Logger log = Logger.getLogger(this.getClass());
	
	@Resource private BoardService boardService;	//작성자의 회원번호를 알아내기 위해 필요
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		if (log.isDebugEnabled()) {
			log.debug("<<로그인 아이디, 작성자 아이디 일치 여부 체크>>");
		}
		
		//작성자의 회원번호 구하기
		int board_num = Integer.parseInt(request.getParameter("board_num"));
		BoardVO board = boardService.selectBoard(board_num);
		
		//로그인 회원번호 구하기
		HttpSession session = request.getSession();
		MemberVO user = (MemberVO)session.getAttribute("user");
		
		if (log.isDebugEnabled()) {
			log.debug("<<로그인 회원번호>>" + user.getMem_num());
			log.debug("<<작성자 회원번호>>" + board.getMem_num());
		}
		
		//로그인 회원번호와 작성자 회원번호 일치 여부 체크
		if (user == null || user.getMem_num() != board.getMem_num()) {
			if (log.isDebugEnabled()) {
				log.debug("<<로그인 아이디와 작성자 아이디 불일치>>");
			}
			
			//로그인 아이디와 작성자 아이디가 불일치할 때 경고 페이지 호출, 컨트롤러가 호출하는 것이 아님!
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/common/notice.jsp");
			dispatcher.forward(request, response);
			
			return false;
		}
		
		if (log.isDebugEnabled()) {
			log.debug("<<로그인 아이디와 작성자 아이디 일치>>");
		}
		
		return true;
	}
	
}