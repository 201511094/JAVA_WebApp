
public class SwitchCharExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'B';
		
		switch(grade) {
			case 'A':
			case 'a':
				System.out.println(grade+": ��� ȸ���Դϴ�.");
				break;
				
			case 'B':
			case 'b':
				System.out.println(grade+": �Ϲ� ȸ���Դϴ�.");
				break;
				
			default:
				System.out.println(grade+": �մ��Դϴ�.");
		}
	}
}