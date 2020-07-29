package package_exam10;

import java.util.regex.Pattern;

public class PatternMatcherExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id = "5Angel1004";
		//대소문자를 모두 허용할 경우의 정규표현식
		String regExp = "[a-zA-Z][a-zA-Z0-9]{7,11}";
		boolean isMatch = Pattern.matches(regExp, id);
		
		if (isMatch) {
			System.out.println("ID로 사용할 수 있습니다.");
		}
		else {
			System.out.println("ID로 사용할 수 없습니다.");
		}
		
	}
}