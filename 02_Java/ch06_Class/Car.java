
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
	
	int gas;
	
	void setGas(int gas) {
		this.gas=gas;
	}
	
	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
		
	}
	
	void run() {
		while(true) {
			if (gas>0) {
				System.out.println("달립니다. gas잔량: "+gas);
				gas -= 1;
			}
			else {
				System.out.println("멈춥니다. gas잔량: "+gas);
				return;
			}
		}
	}
	
}