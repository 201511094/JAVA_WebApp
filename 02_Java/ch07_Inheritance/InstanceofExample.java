
public class InstanceofExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
//		Parent parentB = new Parent();
//		method1(parentB);
//		method2(parentB);	//클래스 형 변환 예외발생
		
		//예외처리
		try {
			Parent parentB = new Parent();
			method1(parentB);
			method2(parentB);
		} catch (ClassCastException e){
			System.out.println("클래스 캐스팅 예외발생");
		}
	}
	
	public static void method1(Parent parent) {
		if (parent instanceof Child) {
			Child child = (Child) parent;
			System.out.println("method1 - Child로 변환 성공");
		}
		else {
			System.out.println("method1 - Child로 변환되지 않음");
		}

	}
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child로 변환 성공");
	}
}