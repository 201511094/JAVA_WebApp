
public class AccuracyExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
		double result = apple - number*pieceUnit;	//근사치
		
		System.out.println("사과 한 개에서 ");
		System.out.println("0.7조각을 빼면, ");
		System.out.println(result + " 조각이 남는다.");
	}
}