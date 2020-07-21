
public class Main {
	public static void main(String[] args) {
		A a = new A();
		
		//인스턴스멤버 클래스 객체 생성
		A.B b = a.new B();
		b.field1=3;
		b.method1();
		
		//정적멤버 클래스 객체 생성
		A.C c = new A.C();
		c.field1=3;
		c.method1();
		A.C.field2=3;
		A.C.method2();
		
		//로컬클래스 객체 생성을 위한 메소드
		a.method();
	}
}