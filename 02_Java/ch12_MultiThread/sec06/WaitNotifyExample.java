package sec06;

//public class WaitNotifyExample {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		WorkObject sharedObject = new WorkObject();	//공유객체 생성
//		
//		ThreadA threadA = new ThreadA(sharedObject);
//		ThreadB threadB = new ThreadB(sharedObject);
//		
//		threadA.start();
//		threadB.start();
//		
//	}
//	//공유객체는 두 스레드가 작업할 내용을 동기화 메소드로 구분해놓음
//	//한 스레드가 작업을 완료하면 notify()메소드 호출 -> 다른 스레드를 실행 대기 상태로 만들고 wait()메소드를 호출하여 일시정지 상태로 만듦
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