package sec05;

public class StatePrintThread extends Thread {
	private Thread targetThread;
	
	public StatePrintThread(Thread targetThread) {
		this.targetThread=targetThread;
	}
	
	//������ ���� ���
	public void run() {
		while (true) {
			Thread.State state=targetThread.getState();
			System.out.println("Ÿ�� ������ ����: "+state);
			
			if (state==Thread.State.NEW) {
				targetThread.start();	//��ü ���� ���� -> ���� ��� ����
			}
			if (state==Thread.State.TERMINATED) {
				break;	//���� ���� -> while-loop ����
			}
			
			try {Thread.sleep(500);}	//0.5s �Ͻ�����
			catch (Exception e) {}
		}
	}
}
