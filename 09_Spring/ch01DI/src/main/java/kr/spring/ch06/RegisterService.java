package kr.spring.ch06;

public class RegisterService {
	//프로퍼티
	private RegisterDAO registerDAO;
	
	//객체를 주입 받는 메소드
	public void setRegisterDAO(RegisterDAO registerDAO) {
		this.registerDAO = registerDAO;
	}
	
	public void write() {
		System.out.println("RegisterService의 write() 메소드 실행");
		
		registerDAO.insert();
	}
	
}