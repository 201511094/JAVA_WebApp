package sec06;

public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA�� methodA() �۾� ����");
		notify();	//ThreadB�� ��������·� ����
		try {wait();}	//ThreadA�� �Ͻ��������·� ����
		catch (InterruptedException e) {}
	}
	
	public synchronized void methodB() {
		System.out.println("ThreadB�� methodB() �۾� ����");
		notify();	//ThreadA�� ��������·� ����
		try {wait();}	//ThreadB�� �Ͻ��������·� ����
		catch (InterruptedException e) {}
	}
	
}
