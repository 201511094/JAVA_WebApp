package sec06;

public class JoinExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumThread sumThread=new SumThread();
		sumThread.start();
		
		try {sumThread.join();}	//sumThread종료할 때까지 메인스레드 일시정지
		catch (InterruptedException e) {}
		
		System.out.println("1 ~ 100 합: "+sumThread.getSum());
		
	}
	//다른 스레드가 종료될 때까지 일시정지 상태 유지
}