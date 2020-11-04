package kr.spring.member.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.spring.member.service.MemberService;
import kr.spring.member.vo.MemberVO;
import kr.spring.util.LoginCheckException;

@Controller
public class MemberController {
	private Logger log = Logger.getLogger(this.getClass());
	
	@Resource private MemberService memberService;
	
	//자바빈(VO) 초기화
	@ModelAttribute
	public MemberVO initCommand() {
		return new MemberVO();
	}
	
	//회원가입 폼 
	@RequestMapping(value="/member/registerUser.do", method=RequestMethod.GET)
	public String form() {
		return "memberRegister";
	}
	
	//회원가입 처리
	@RequestMapping(value="/member/registerUser.do", method=RequestMethod.POST)
	public String submit(@Valid MemberVO memberVO, BindingResult result) {
		if (log.isDebugEnabled()) {
			log.debug("<<회원 가입>> : " + memberVO);
		}
		
		//유효성 체크 결과 오류가 있으면 폼 호출
		if (result.hasErrors()) {
			return form();
		}
		
		//회원 가입
		memberService.insertMember(memberVO);
		
		return "redirect:/main/main.do";
	}
	
	//로그인 폼
	@RequestMapping(value="/member/login.do", method=RequestMethod.GET)
	public String formLogin() {
		return "memberLogin";
	}
	
	//로그인 처리
	@RequestMapping(value="/member/login.do", method=RequestMethod.POST)
	public String submitLogin(@Valid MemberVO memberVO, BindingResult result, HttpSession session) {
		if (log.isDebugEnabled()) {
			log.debug("<<MemberVO>> : " + memberVO);
		}
		
		//id와 passwd 필드만 체크
		if (result.hasFieldErrors("id") || result.hasFieldErrors("passwd")) {
			return formLogin();
		}
		
		//로그인 체크(id와 비밀번호 일치 여부 체크)
		try {
			MemberVO member = memberService.selectCheckMember(memberVO.getId());
			boolean check = false;
			
			if (member!=null) {
				//비밀번호 일치 여부 체크
				check = member.isCheckedPasswd(memberVO.getPasswd());
			}
			
			if (check) {
				//인증 성공, 로그인 처리
				session.setAttribute("user", member);
				
				return "redirect:/main/main.do";
			}
			else {
				//인증 실패
				throw new LoginCheckException();
			}
			
		} catch(LoginCheckException e) {
			//인증 실패로 로그인폼 호출
			result.reject("invalidIdOrPassword");
			
			return formLogin();
		}
	}
	
	//로그아웃
	@RequestMapping("/member/logout.do")
	public String processLogout(HttpSession session) {
		//로그아웃 처리
		session.invalidate();
		
		return "redirect:/main/main.do";
	}
	
}