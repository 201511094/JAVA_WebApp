package package_exam02;

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1=new MovieThread();
		thread1.start();
		
		Thread thread2=new Thread(new MusicRunnable());
		thread2.start();
		
	}
}