
public class CheckOverflowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Integer.MIN_VALUE��: "+Integer.MIN_VALUE);
		System.out.println("Integer.MAX_VALUE��: "+Integer.MAX_VALUE);
		
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println("�����÷ο찡 �߻��Ͽ� ��Ȯ�ϰ� ����� �� ����");
		}
	}
	//������ ���� ���
	public static int safeAdd(int left, int right)  {
		if(right > 0) { 
			if(left > (Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("�����÷ο� �߻�");
			}
		}
		else {
			if(left < (Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("�����÷ο� �߻�");
			}
		}
		
		return left + right;
	}
}