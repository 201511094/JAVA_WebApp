package sec06;

public class ThreadA extends Thread {
//	public boolean stop=false;
//	public boolean work=true;
//	
//	public void run() {
//		while (!stop) {
//			if (work) {
//				System.out.println("ThreadA 작업내용");
//			}
//			else {
//				Thread.yield();	//work가 false이면 스레드 실행 양보
//			}
//		}
//		System.out.println("ThreadA 종료");
//	}
	
	
	private WorkObject workObject;

	public ThreadA(WorkObject workObject) {
		this.workObject = workObject;	//공유객체를 매개값으로 받아 필드에 저장
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodB();
		}
	}
	
}