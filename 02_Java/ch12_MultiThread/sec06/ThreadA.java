package sec06;

public class ThreadA extends Thread {
//	public boolean stop=false;
//	public boolean work=true;
//	
//	public void run() {
//		while (!stop) {
//			if (work) {
//				System.out.println("ThreadA �۾�����");
//			}
//			else {
//				Thread.yield();	//work�� false�̸� ������ ���� �纸
//			}
//		}
//		System.out.println("ThreadA ����");
//	}
	
	
	private WorkObject workObject;

	public ThreadA(WorkObject workObject) {
		this.workObject = workObject;	//������ü�� �Ű������� �޾� �ʵ忡 ����
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			workObject.methodB();
		}
	}
	
}