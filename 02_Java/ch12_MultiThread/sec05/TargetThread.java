package sec05;

public class TargetThread extends Thread {
	public void run() {
		for (long i=0;i<1000000000;i++) {}	//RUNABLE���� ����
		
		try {Thread.sleep(1500);}	//1.5s�� TIMED_WAITING���� ����
		catch (Exception e) {}
		
		for (long i=0;i<1000000000;i++) {}	//RUNABLE���� ����
		
	}
}