package sec07;

public class StringSubstringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "880815-1234567";
		String firstNum = ssn.substring(0, 6);	//���ڸ�
		String secondNum = ssn.substring(7);	//���ڸ�
		
		System.out.println("���ڸ�: "+firstNum);
		System.out.println("���ڸ�: "+secondNum);
		
	}
}