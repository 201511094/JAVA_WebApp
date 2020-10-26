package kr.spring.ch07.service;

import kr.spring.ch07.model.LoginCommand;

public class LoginService {
	public void checkLogin(LoginCommand loginCommand) throws LoginCheckException {
		//테스트 용도, userId와 password가 일치하면 로그인 성공으로 간주
		if (!loginCommand.getUserId().equals(loginCommand.getPassword())) {
			System.out.println("인증 에러: " + loginCommand.getUserId());
			
			throw new LoginCheckException();	//로그인이 실패하면 호출됨
		}
	}
}