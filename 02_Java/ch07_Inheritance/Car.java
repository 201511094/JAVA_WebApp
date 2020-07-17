
public class Car {
//	public int speed;
//	
//	public void speedUp() {
//		speed += 1;
//	}
//	public final void stop() {
//		System.out.println("차를 멈춤");
//		speed=0;
//	}
	
	
	//필드 다형성Polymorphism
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire backLeftTire = new Tire("뒤왼쪽", 3);
	Tire backRightTire = new Tire("뒤오른쪽", 4);
	
	//모든 타이어를 1회 회전시킴
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if (frontLeftTire.roll()==false) { stop(); return 1; };
		if (frontRightTire.roll()==false) { stop(); return 2; };
		if (backLeftTire.roll()==false) { stop(); return 3; };
		if (backRightTire.roll()==false) { stop(); return 4; };
		return 0;
	}
	void stop() {
		System.out.println("[자동차가 멈춥니다.]");
	}
	
}