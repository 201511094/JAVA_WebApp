package sec07;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVal1 = new String("kjh");
		String strVal2 = "kjh";
		
		if (strVal1 == strVal2) {
			System.out.println("같은 객체를 참조");
		}
		else {
			System.out.println("다른 객체를 참조");
		}
		
		if (strVal1.equals(strVal2)) {
			System.out.println("같은 문자열을 가짐");
		}
		else {
			System.out.println("다른 문자열을 가짐");
		}
	}
}