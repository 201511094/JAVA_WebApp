
public class test0803_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 70;
		
//		switch(score) {
//		case 70:
//		case 80:
//			System.out.println("B학점");
//		case 90:
//			System.out.println("A학점");
//			break;
//		default:
//			System.out.println("낙제");
//		}
		
		if (score >= 90) {
			System.out.println("A학점");
		}
		else if (score >= 70) {
			System.out.println("B학점");
			System.out.println("A학점");
		}
		else {
			System.out.println("낙제");
		}
		
	}	
}