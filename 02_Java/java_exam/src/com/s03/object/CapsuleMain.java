package com.s03.object;

class Capsule {
	//은닉화
	private int a;
	
	//캡슐화
	public void setA(int a) {
		if (a >= 0) {
			this.a = a;
		} else {
			System.out.println("음수는 허용되지 않습니다.");
		}
	}
	public int getA() {
		return a;
	}
}

public class CapsuleMain {
	public static void main(String[] args) {
		Capsule cap = new Capsule();
		//변수 a의 접근 지정자(제한자)가 private이기 때문에
		//같은 클래스에서는 호출이 가능하지만 다른 클래스에서는 호출 불가능
		//System.out.println(cap.a);
		
		cap.setA(-10);	//멤버변수에 값 저장
		//멤버변수의 값을 읽어와서 출력
		System.out.println(cap.getA());
	}
}