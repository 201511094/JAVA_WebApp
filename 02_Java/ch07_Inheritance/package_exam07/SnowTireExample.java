package package_exam07;

public class SnowTireExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire;
		
		snowTire.run();	//SnowTire객체 -> 스노우타이어
		tire.run();	//타입변환 -> 일반타이어가 아닌 스노우타이어
	}
}