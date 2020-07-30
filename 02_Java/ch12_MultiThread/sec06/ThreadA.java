package sec06;

public class ThreadA extends Thread {
	public boolean stop=false;
	public boolean work=true;
	
	public void run() {
		while (!stop) {
			if (work) {
				System.out.println("ThreadA 작업내용");
			}
			else {
				Thread.yield();	//work가 false이면 스레드 실행 양보
			}
		}
		System.out.println("ThreadA 종료");
	}
	
}