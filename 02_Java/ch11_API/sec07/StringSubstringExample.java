package sec07;

public class StringSubstringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "880815-1234567";
		String firstNum = ssn.substring(0, 6);	//앞자리
		String secondNum = ssn.substring(7);	//뒷자리
		
		System.out.println("앞자리: "+firstNum);
		System.out.println("뒷자리: "+secondNum);
		
	}
}