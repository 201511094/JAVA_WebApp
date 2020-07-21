/* 1. 바깥 필드와 메소드에서 사용제한 */
/*
public class A {
	//인스턴스 필드
	B field1 = new B();
	C field2 = new C();
	
	//인스턴스 메소드
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	
	//정적필드 초기화
	//static B field3 = new B();
	static C field4 = new C();
	
	//정적메소드
	static void method2() {
		//B var1 = new B();
		C var2 = new C();
	}
	
	//인스턴스멤버 클래스
	class B {}
	
	//정적멤버 클래스
	static class C {}
}
*/

/* 2. 멤버 클래스에서 사용제한 */

public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B {
		void method() {
			//모든 필드와 메소드에 접근 가능
			field1=10;
			method1();
			
			field2=20;
			method2();
		}
	}
	
	static class C {
		void method() {
			//인스턴스 필드와 메소드에는 접근 불가능
//			field1=10;
//			method1();
			
			field2=20;
			method2();
		}
	}
}
