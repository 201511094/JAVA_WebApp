package sec02;

import java.awt.Toolkit;

public class BeepPrintExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		for (int i=0;i<5;i++) {
			toolkit.beep();
			try {Thread.sleep(500);}
			catch (Exception e) {}
		}
		for (int i=0;i<5;i++) {
			System.out.println("띵");
			try {Thread.sleep(500);}
			catch (Exception e) {}
		}
		//비프음 발생 후 프린팅
	}
}