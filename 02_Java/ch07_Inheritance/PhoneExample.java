
public class PhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Phone phone = new Phone();	//추상클래스이므로 인스턴스 생성 불가능
		
		SmartPhone smartPhone = new SmartPhone("kjh");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
		
	}
}