
public class MyClassB implements MyInterface {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("MyClassB-method1() 실행");
	}
	@Override
	//디폴트 메소드 재정의
	public void method2() {
		System.out.println("MyClassB-method2() 실행");
	}
	
}
