package sec02;

/* 바깥 클래스 */
public class A {
	A() {System.out.println("A객체가 생성됨");}
	
	/* 인스턴스멤버 클래스 */
	//정적 필드와 메소드 선언 불가능
	class B {
		B() {System.out.println("B객체가 생성됨");}
		int field1;
		void method1() {System.out.println("클래스B의 method1()");}

//		static int field2;
//		static void method2() {}
	}
	
	/* 정적멤버 클래스 */
	static class C {
		C() {System.out.println("C객체가 생성됨");}
		int field1;
		static int field2;
		void method1() {System.out.println("클래스C의 method1()");}
		static void method2() {System.out.println("클래스C의 method2()");}
	}
	
	void method() {
		/* 로컬 클래스 - 메소드 내에 선언한 중첩 클래스 */
		//접근제한자 및 static 선언 불가능
		class D {
			D() {System.out.println("D객체가 생성됨");}
			int field1;
			void method1() {System.out.println("클래스D의 method1()");}
//			static int field2;
//			static void method2() {}
		}
		
		D d = new D();
		d.field1=3;
		d.method1();
		
	}
}