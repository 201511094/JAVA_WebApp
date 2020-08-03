package package_exam10;

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread=new MovieThread();
		//메인 스레드 종료 시 MovieThread도 같이 종료되도록
		thread.setDaemon(true);
		thread.start();
		
		try {Thread.sleep(3000);}
		catch (InterruptedException e) {}
		
	}
}