package sec06;

public class ThreadB extends Thread {
//	public boolean stop=false;
//	public boolean work=true;
//	
//	public void run() {
//		while (!stop) {
//			if (work) {
//				System.out.println("ThreadB �۾�����");
//			}
//			else {
//				Thread.yield();	//work�� false�̸� ������ ���� �纸
//			}
//		}
//		System.out.println("ThreadB ����");
//	}

	
	private WorkObject workObject;

	public ThreadB(WorkObject workObject) {
		this.workObject = workObject;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodA();
		}
	}
	
}