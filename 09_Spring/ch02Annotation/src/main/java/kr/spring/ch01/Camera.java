package kr.spring.ch01;

import org.springframework.beans.factory.annotation.Required;

public class Camera {
	//프로퍼티
	private int number;

	/*
	 	@Required
	 	어노테이션을 이용한 필수 프로퍼티 검사, 데이터를 꼭 넣어야 함
	 	메소드에만 표시 가능, 프로퍼티에는 표시 불가능
	*/
	@Required
	//객체를 주입받는 메소드
	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "Camera [number=" + number + "]";
	}
	
}