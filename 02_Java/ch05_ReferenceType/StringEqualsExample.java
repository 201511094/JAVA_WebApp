
public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = "kjh";
		String strVar2 = "kjh";
		
		if (strVar1 == strVar2) {
			System.out.println("strVar1�� strVar2�� ������ ����");
		}
		else {
			System.out.println("strVar1�� strVar2�� ������ �ٸ�");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1�� strVar2�� ���ڿ��� ����");
		}
		
		String strVar3 = new String("kjh");
		String strVar4 = new String("kjh");
		
		if (strVar3 == strVar4) {
			System.out.println("strVar3�� strVar4�� ������ ����");
		}
		else {
			System.out.println("strVar3�� strVar4�� ������ �ٸ�");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3�� strVar4�� ���ڿ��� ����");
		}	
	}
}