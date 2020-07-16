
public class InputDataCheckNaNExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userInput = "NaN";
		double val = Double.valueOf(userInput);
		double currentBalance = 10000.0;
		
		//NaN 체크
		if (Double.isNaN(val)) {
			System.out.println("NaN이 입력되어 처리할 수 없음");
			val = 0.0;
		} 
		
		currentBalance += val;
		System.out.println(currentBalance);
	}
}