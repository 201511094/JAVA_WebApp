package sec06;

public class ThreadA extends Thread {
	public boolean stop=false;
	public boolean work=true;
	
	public void run() {
		while (!stop) {
			if (work) {
				System.out.println("ThreadA �۾�����");
			}
			else {
				Thread.yield();	//work�� false�̸� ������ ���� �纸
			}
		}
		System.out.println("ThreadA ����");
	}
	
}