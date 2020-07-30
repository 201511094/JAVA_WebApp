package sec02;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {	//메인 스레드
		// TODO Auto-generated method stub
		//방법1
		Runnable beepTask=new BeepTask();	//객체 생성
		Thread thread=new Thread(beepTask);	//작업 스레드 생성
		thread.start();	//BeepTask객체의 run()메소드 실행

		//방법2 - Runnable 익명객체
//		Thread thread=new Thread(new Runnable() {
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				Toolkit toolkit=Toolkit.getDefaultToolkit();
//				for (int i=0;i<5;i++) {
//					toolkit.beep();
//					try {Thread.sleep(500);}
//					catch (Exception e) {}
//				}
//			}	
//		});
		
		//방법3 - 람다식
//		Thread thread=new Thread(() -> {
//			Toolkit toolkit=Toolkit.getDefaultToolkit();
//			for (int i=0;i<5;i++) {
//				toolkit.beep();
//				try {Thread.sleep(500);}
//				catch (Exception e) {}
//			}
//		});
		
		for (int i=0;i<5;i++) {
			System.out.println("띵");
			try {Thread.sleep(500);}
			catch (Exception e) {}
		}
		//메인과 작업 스레드가 동시 실행
	}
}