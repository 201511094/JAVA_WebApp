
public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		
		Parent parent=child;
		parent.method1();	//부모클래스의 메소드
		parent.method2();	///오버라이딩 -> 자식클래스의 메소드
		//parent.method3();	//호출 불가능
	}
}