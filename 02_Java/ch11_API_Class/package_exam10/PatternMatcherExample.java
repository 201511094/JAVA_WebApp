package package_exam10;

import java.util.regex.Pattern;

public class PatternMatcherExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = "5Angel1004";
		//��ҹ��ڸ� ��� ����� ����� ����ǥ����
		String regExp = "[a-zA-Z][a-zA-Z0-9]{7,11}";
		boolean isMatch = Pattern.matches(regExp, id);
		
		if (isMatch) {
			System.out.println("ID�� ����� �� �ֽ��ϴ�.");
		}
		else {
			System.out.println("ID�� ����� �� �����ϴ�.");
		}
		
	}
}