package sec06;

public class ThreadB extends Thread {
	public boolean stop=false;
	public boolean work=true;
	
	public void run() {
		while (!stop) {
			if (work) {
				System.out.println("ThreadB 작업내용");
			}
			else {
				Thread.yield();	//work가 false이면 스레드 실행 양보
			}
		}
		System.out.println("ThreadB 종료");
	}
}