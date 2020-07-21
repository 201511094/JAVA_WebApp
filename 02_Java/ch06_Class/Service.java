
public class Service {
	@PrintAnnotation	//default값인 "-", 15
	public void method1() {
		System.out.println("실행내용1 출력완료");
	}
	@PrintAnnotation("*")	//"*", default값 15
	public void method2() {
		System.out.println("실행내용2 출력완료");
	}
	@PrintAnnotation(value="#", number=20)
	public void method3() {
		System.out.println("실행내용3 출력완료");
	}
	
}