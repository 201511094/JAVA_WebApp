package sec06;

//public class WaitNotifyExample {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		WorkObject sharedObject = new WorkObject();	//������ü ����
//		
//		ThreadA threadA = new ThreadA(sharedObject);
//		ThreadB threadB = new ThreadB(sharedObject);
//		
//		threadA.start();
//		threadB.start();
//		
//	}
//	//������ü�� �� �����尡 �۾��� ������ ����ȭ �޼ҵ�� �����س���
//	//�� �����尡 �۾��� �Ϸ��ϸ� notify()�޼ҵ� ȣ�� -> �ٸ� �����带 ���� ��� ���·� ����� wait()�޼ҵ带 ȣ���Ͽ� �Ͻ����� ���·� ����
//}


public class WaitNotifyExample {
	public static void main(String[] args) {
		DataBox dataBox = new DataBox();
		
		ProducerThread producerThread = new ProducerThread(dataBox);
		ConsumerThread consumerThread = new ConsumerThread(dataBox);
		
		producerThread.start();
		consumerThread.start();
		
	}
}