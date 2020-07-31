package sec05;

public class TargetThread extends Thread {
	public void run() {
		for (long i=0;i<1000000000;i++) {}	//RUNABLE상태 유지
		
		try {Thread.sleep(1500);}	//1.5s간 TIMED_WAITING상태 유지
		catch (Exception e) {}
		
		for (long i=0;i<1000000000;i++) {}	//RUNABLE상태 유지
		
	}
}