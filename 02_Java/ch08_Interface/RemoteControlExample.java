
public class RemoteControlExample {

	public static void main(String[] args) {
		//RemoteControl rc;	//RemoteControl타입 변수 선언
		
		//구현 객체 대입, 구현 객체를 인터페이스 변수에 대입해서 사용
//		rc = new Television();
//		rc = new Audio();
		
		//익명 구현 클래스 - bin\RemoteControlExample$1
//		RemoteControl rc = new RemoteControl() {
//			public void turnOn() {}
//			public void turnOff() {}
//			public void setVolume(int volume) {}
//		};
		
		//인터페이스 사용
//		RemoteControl rc = null;
//		rc = new Television();
//		rc.turnOn();
//		//rc.turnOff();
//		rc.setMute(true);
//		
//		rc = new Audio();
//		rc.turnOn();
//		//rc.turnOff();
//		rc.setMute(true);
		
		//정적 메소드 사용
		RemoteControl.changeBattery();
		
	}
}