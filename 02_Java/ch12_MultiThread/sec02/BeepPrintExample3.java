package sec02;

public class BeepPrintExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread=new BeepThread();
		thread.start();
		
		for (int i=0;i<5;i++) {
			System.out.println("��");
			try {Thread.sleep(500);}
			catch (Exception e) {}
		}
	}
	//메인과 작업 스레드가 동시 실행
}