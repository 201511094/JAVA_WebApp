
public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode=SupersonicAirplane.SUPERSONIC;	//초음속비행
		sa.fly();
		sa.flyMode=SupersonicAirplane.NORMAL;	//일반비행
		sa.fly();
		sa.land();
	}
}