package sec07;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVal1 = new String("kjh");
		String strVal2 = "kjh";
		
		if (strVal1 == strVal2) {
			System.out.println("���� ��ü�� ����");
		}
		else {
			System.out.println("�ٸ� ��ü�� ����");
		}
		
		if (strVal1.equals(strVal2)) {
			System.out.println("���� ���ڿ��� ����");
		}
		else {
			System.out.println("�ٸ� ���ڿ��� ����");
		}
	}
}