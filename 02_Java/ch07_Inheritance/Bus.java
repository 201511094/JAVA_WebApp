
public class Bus extends Vehicle {
	@Override
	public void run() {
		super.run();	//부모메소드를 호출하도록 변경
		//System.out.println("버스가 달립니다.");
	}
}