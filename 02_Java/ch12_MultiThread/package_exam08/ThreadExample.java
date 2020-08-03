package package_exam08;

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread=new MovieThread();
		thread.start();
		
		try {Thread.sleep(1000);}
		catch (InterruptedException e) {}
		
		thread.interrupt();
		
	}
}