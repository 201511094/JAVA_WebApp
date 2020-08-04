package sec05;

public class RunnableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Runnable runnable = () -> {
//			for(int i=0; i<10; i++) {
//				System.out.println(i);
//			}
//		};
//	
//		Thread thread = new Thread(runnable);
//		thread.start();
	
		//람다식을 매매값으로 대입
		Thread thread = new Thread(() -> {
			for(int i=0; i<10; i++) {
				System.out.println(i);
			}
		});
		thread.start();
		
	}
}