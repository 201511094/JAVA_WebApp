
public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Child child = new Child();
//		
//		Parent parent=child;
//		parent.method1();	//부모클래스의 메소드
//		parent.method2();	///오버라이딩 -> 자식클래스의 메소드
//		//parent.method3();	//호출 불가능
		
		Parent parent = new Child();	//자동타입변환
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		//자식타입에만 선언되어 있으므로 불가능
//		parent.field2 = "data2";
//		parent.method3();
		
		Child child = (Child) parent;	//강제타입변환
		child.field2 = "yyy";
		child.method3();
		
	}
}