
public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data1 = "100";
		String data2 = "a100";
				
		int value1 = Integer.parseInt(data1);
		System.out.println("value1: "+value1);
		
		try {
			int value2 = Integer.parseInt(data2);	//NumberFormatException
			System.out.println("value2: "+value2);
			
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 + " = " + result);
			
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException 예외 발생");
			
		} finally {
			System.out.println("프로그램 종료");
		}
	}
}