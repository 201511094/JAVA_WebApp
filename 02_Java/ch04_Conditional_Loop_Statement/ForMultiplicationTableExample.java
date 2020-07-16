
public class ForMultiplicationTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for (int m=2; m<=9; m++) {
//			System.out.println("*** 구구단 " + m + "단 ***");
//		
//			for (int n=1; n<=9; n++) {
//			System.out.println(m + " x " + n + " = " + (m*n));
//		}
//	}
		
		//�������
		for (int i=2; i<10; i++) {
			System.out.printf("%-15s", "*** "+i+"�� ***");
		}
		System.out.println();
		
		for (int i=1; i<10; i++) {
			for (int j=2 ;j<10; j++) {
				System.out.printf("%-15s", j+" x "+i+" = "+j*i);
			}
			System.out.println();
		}
	}
}