package kr.spring.ch04;

import javax.annotation.Resource;

public class HomeController {
	//빈 이름과 프로퍼티명이 일치하면 의존 관계 설정, 같은 타입의 객체가 여러 개더라도 충돌이 발생하지 않음
	@Resource
	private Camera camera2;
	//@Resource(name="빈 객체의 이름") - 빈 객체의 이름 지정
	@Resource(name="cameraZ")	//bean의 id값이 cameraZ인 객체를 읽겠다는 의미
	private Camera camera3;
	private Camera camera4;
	
	public void setCamera2(Camera camera2) {
		this.camera2 = camera2;
	}
	
	public void setCamera3(Camera camera3) {
		this.camera3 = camera3;
	}
	
	@Resource
	public void setCamera4(Camera camera4) {
		this.camera4 = camera4;
	}
	
	@Override
	public String toString() {
		return "HomeController [camera2=" + camera2 + ", camera3=" + camera3 + ", camera4=" + camera4 + "]";
	}
	
}