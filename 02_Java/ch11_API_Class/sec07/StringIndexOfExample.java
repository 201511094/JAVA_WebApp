package sec07;

public class StringIndexOfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String subject = "자바 프로그래밍";
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		if (subject.indexOf("자바") != -1) {
			//"자바"라는 문자열이 있으면
			System.out.println("자바과 관련된 책입니다.");
		}
		else {
			System.out.println("자바과 관련없는 책입니다.");
		}
	}
	
}