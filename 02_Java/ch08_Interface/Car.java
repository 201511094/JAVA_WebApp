
public class Car {
	//인터페이스 타입 필드 선언 및 초기 구현 객체 대입
	Tire frontLeftTire = new HankookTire();
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	//인터페이스에서 설명된 roll() 호출
	void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
	
}