
public class Car {
	
//	String company="현대자동차";
//	String model="그랜저";
//	String color="검정";
//	int maxSpeed=350;
//	int speed;
	 
	//필드
//	String company="현대자동차";
//	String model;
//	String color;
//	int maxSpeed;
	
	
	//생성자
//	Car() {}
//	Car(String model) {
//		this.model=model;
//	}
//	Car(String model, String color) {
//		this.model=model;
//		this.color=color;
//	}
//	Car(String model, String color, int maxSpeed) {
//		this.model=model;
//		this.color=color;
//		this.maxSpeed=maxSpeed;
//	}
	
	
	//생성자 중복 지우기
//	Car() {}
//	Car(String model){
//		this(model, "은색", 250);		//맨 밑의 생성자 호출
//	}
//	Car(String model, String color) {
//		this(model, color, 250);	//맨 밑의 생성자 호출
//	}
//	Car(String model, String color, int maxSpeed) {
//		this.model=model;
//		this.color=color;
//		this.maxSpeed=maxSpeed;
//	}
	
	//메소드 리턴값
//	int gas;
//	
//	void setGas(int gas) {
//		this.gas=gas;
//	}
//	boolean isLeftGas() {
//		if (gas == 0) {
//			System.out.println("gas가 없습니다.");
//			return false;
//		}
//		System.out.println("gas가 있습니다.");
//		return true;
//		
//	}
//	void run() {
//		while(true) {
//			if (gas>0) {
//				System.out.println("달립니다. gas잔량: "+gas);
//				gas -= 1;
//			}
//			else {
//				System.out.println("멈춥니다. gas잔량: "+gas);
//				return;
//			}
//		}
//	}
	
	
	//클래스 외부에서 메소드 호출
//	int speed;
//	
//	int getSpeed() {
//		return speed;
//	}
//	void keyTurnOn() {
//		System.out.println("키를 돌립니다.");
//	}
//	void run() {
//		for (int i=10; i<=50; i+=10) {
//			speed=i;
//			System.out.println("달립니다. 시속: "+speed+"km/h");
//		}
//	}
	
	
	//인스턴스 멤버와 this
//	String model;
//	int speed;
//	
//	Car(String model) {
//		this.model=model;
//	}
//	
//	void setSpeed(int speed) {
//		this.speed=speed;
//	}
//	void run() {
//		for (int i=0;i<50;i+=10) {
//			this.setSpeed(i);
//			System.out.println(this.model+"이/가 달립니다. 시속: "+this.speed+"km/h");
//		}
//	}
	
	
	//정적 메소드와 블록 선언
	//CarExample.java 주석처리 필요
	int speed;
	
	void run() {
		System.out.println(speed+"으로 달립니다.");
	}
	public static void main(String[] args) {
		Car myCar=new Car();
		myCar.speed=60;
		myCar.run();
	}
	
}