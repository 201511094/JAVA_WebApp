
public class Car {
	
//	String company="�����ڵ���";
//	String model="�׷���";
//	String color="����";
//	int maxSpeed=350;
//	int speed;
	 
	//�ʵ�
//	String company="�����ڵ���";
//	String model;
//	String color;
//	int maxSpeed;
	
	
	//������
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
	
	
	//������ �ߺ� �����
//	Car() {}
//	Car(String model){
//		this(model, "����", 250);		//�� ���� ������ ȣ��
//	}
//	Car(String model, String color) {
//		this(model, color, 250);	//�� ���� ������ ȣ��
//	}
//	Car(String model, String color, int maxSpeed) {
//		this.model=model;
//		this.color=color;
//		this.maxSpeed=maxSpeed;
//	}
	
	//�޼ҵ� ���ϰ�
//	int gas;
//	
//	void setGas(int gas) {
//		this.gas=gas;
//	}
//	boolean isLeftGas() {
//		if (gas == 0) {
//			System.out.println("gas�� �����ϴ�.");
//			return false;
//		}
//		System.out.println("gas�� �ֽ��ϴ�.");
//		return true;
//		
//	}
//	void run() {
//		while(true) {
//			if (gas>0) {
//				System.out.println("�޸��ϴ�. gas�ܷ�: "+gas);
//				gas -= 1;
//			}
//			else {
//				System.out.println("����ϴ�. gas�ܷ�: "+gas);
//				return;
//			}
//		}
//	}
	
	
	//Ŭ���� �ܺο��� �޼ҵ� ȣ��
	int speed;
	
	int getSpeed() {
		return speed;
	}
	void keyTurnOn() {
		System.out.println("Ű�� �����ϴ�.");
	}
	void run() {
		for (int i=10; i<=50; i+=10) {
			speed=i;
			System.out.println("�޸��ϴ�. �ü�: "+speed+"km/h");
		}
	}
	
}