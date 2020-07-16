
public class InputDataCheckNaNExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userInput = "NaN";	//악의적 입력
		double val = Double.valueOf( userInput );
		double currentBalance = 10000.0;
		
		currentBalance += val;
		System.out.println(currentBalance);	//NaN
	}
}