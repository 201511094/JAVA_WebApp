package kr.spring.ch01.service;

import kr.spring.ch01.model.LoginCommand;

public class LoginService {
	public void checkLogin(LoginCommand command) throws LoginCheckException {
		//테스트용으로 id와 비밀번호가 일치하지 않으면 로그인 실패
		if (!command.getId().equals(command.getPassword())) {
			throw new LoginCheckException("Invalid Id or Password");
		}
	}
	
}