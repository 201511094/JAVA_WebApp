
public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = "kjh";
		String strVar2 = "kjh";
		String strVar3 = new String("kjh");

		//������ ����� ���� ��
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);	//false
		
		//��ü�� ������� String��ü�� ���ڿ��� ��
		//equals�޼ҵ�� �������ڿ��� �Ű������� �־��� �񱳹��ڿ��� �������� ��
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
	}
}