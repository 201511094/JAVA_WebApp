
public class VehicleExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare();	//인터페이스에 없는 메소드라 사용 불가능
		
		Bus bus = (Bus) vehicle;	//강제타입변환
		bus.run();
		bus.checkFare();
	}
}