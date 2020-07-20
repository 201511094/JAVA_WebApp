
public class DefaultMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface mi1 = new MyClassA();
		mi1.method1();
		mi1.method2();	//MyInterface의 method2가 실행됨
		
		MyInterface mi2 = new MyClassB();
		mi2.method1();
		mi2.method2();
		
	}
}