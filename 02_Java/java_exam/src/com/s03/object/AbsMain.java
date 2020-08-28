package com.s03.object;

//추상클래스
//미완성된 개념으로 단독으로 객체 생성이 불가능하고
//일반적으로 자식클래스에 상속되어져서 사용함
abstract class A {
	private int x;
	
	public void setX(int x) {
		this.x = x;
	}
	public int getX() {
		return x;
	}
	//추상메소드
	abstract public void print();
}

class B extends A {
	int b = 200;
	
	//추상메소드 구현
	public void print() {
		System.out.println("클래스B의 print메소드 호출");
	}
}

public class AbsMain {
	public static void main(String[] args) {
		//추상클래스는 객체 생성 불가능
		//A ap = new A();
		B bp = new B();
		bp.setX(100);
		System.out.println(bp.getX());
		bp.print();
	}
}