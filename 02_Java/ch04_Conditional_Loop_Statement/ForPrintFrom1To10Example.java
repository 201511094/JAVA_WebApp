
public class ForPrintFrom1To10Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//		}
		
		//대각선으로 출력
		for (int i=0; i<10; i++) {
			for (int j=0; j<i; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}
}