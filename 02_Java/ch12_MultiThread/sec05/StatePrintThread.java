package sec05;

public class StatePrintThread extends Thread {
	private Thread targetThread;
	
	public StatePrintThread(Thread targetThread) {
		this.targetThread=targetThread;
	}
	
	//스레드 상태 출력
	public void run() {
		while (true) {
			Thread.State state=targetThread.getState();
			System.out.println("타겟 스레드 상태: "+state);
			
			if (state==Thread.State.NEW) {
				targetThread.start();	//객체 생성 상태 -> 실행 대기 상태
			}
			if (state==Thread.State.TERMINATED) {
				break;	//종료 상태 -> while-loop 종료
			}
			
			try {Thread.sleep(500);}	//0.5s 일시정지
			catch (Exception e) {}
		}
	}
}
