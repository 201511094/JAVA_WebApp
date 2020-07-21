
public class DriverExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Driver driver = new Driver();	//Driver객체 생성
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		//자동타입변환 Vehicle vehicle = bus or taxi;
		//매개값의 자동타입변환과 메소드 오버라이딩 -> 매개변수의 다형성 구현
		driver.drive(bus);
		driver.drive(taxi);
		
	}
}