package sec06;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA의 methodA() 작업 실행");
		notify();	//ThreadB를 실행대기상태로 만듦
		try {wait();}	//ThreadA를 일시정지상태로 만듦
		catch (InterruptedException e) {}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB의 methodB() 작업 실행");
		notify();	//ThreadA를 실행대기상태로 만듦
		try {wait();}	//ThreadB를 일시정지상태로 만듦
		catch (InterruptedException e) {}
	}
	
}
