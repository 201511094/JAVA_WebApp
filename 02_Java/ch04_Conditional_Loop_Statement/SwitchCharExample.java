
public class SwitchCharExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'B';
		
		switch(grade) {
			case 'A':
			case 'a':
				System.out.println(grade+": 우수 회원입니다.");
				break;
				
			case 'B':
			case 'b':
				System.out.println(grade+": 일반 회원입니다.");
				break;
				
			default:
				System.out.println(grade+": 손님입니다.");
		}
	}
}