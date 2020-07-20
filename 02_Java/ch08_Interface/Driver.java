
public class Driver {
	//vehicle은 구현 객체
	public void drive(Vehicle vehicle) {
		//vehicle.run();	//구현 객체의 run()메소드가 실행됨
		
		if (vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();	//강제타입변환을 한 이유
		}
		vehicle.run();
	}
}