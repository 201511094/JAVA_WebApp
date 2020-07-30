package sec02;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {	//���� ������
		// TODO Auto-generated method stub
		//���1
		Runnable beepTask=new BeepTask();	//��ü ����
		Thread thread=new Thread(beepTask);	//�۾� ������ ����
		thread.start();	//BeepTask��ü�� run()�޼ҵ� ����

		//���2 - Runnable �͸�ü
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
		
		//���3 - ���ٽ�
//		Thread thread=new Thread(() -> {
//			Toolkit toolkit=Toolkit.getDefaultToolkit();
//			for (int i=0;i<5;i++) {
//				toolkit.beep();
//				try {Thread.sleep(500);}
//				catch (Exception e) {}
//			}
//		});
		
		for (int i=0;i<5;i++) {
			System.out.println("��");
			try {Thread.sleep(500);}
			catch (Exception e) {}
		}
		//���ΰ� �۾� �����尡 ���� ����
	}
}