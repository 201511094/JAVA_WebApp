package package_exam04;

public class NestedClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		//멤버 클래스의 객체 생성
		Car.Tire tire = myCar.new Tire();		//인스턴스 멤버 클래스
		Car.Engine engine = new Car.Engine();	//정적static 멤버 클래스
	}
}