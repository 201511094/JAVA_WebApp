
public class LogicalOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int charCode = 'A';	
		
		if( (charCode>=65) & (charCode<=90) ) {
			System.out.println(charCode+": �빮��");
		}
		if( (charCode>=97) && (charCode<=122) ) {
			System.out.println(charCode+": �ҹ���");
		}	
		if( !(charCode<48) && !(charCode>57) ) {
			System.out.println(charCode+": 0~9 ����");
		}
		
		int value = 6;
		
		if( (value%2==0) | (value%3==0) ) {
			System.out.println(value+": 2 �Ǵ� 3�� ���");
		}
		if( (value%2==0) || (value%3==0) ) {
			System.out.println(value+": 2 �Ǵ� 3�� ���");
		}
	}
}