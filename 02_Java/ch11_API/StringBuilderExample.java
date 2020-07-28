
public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();	//StringBuilder��ü ����
		
		//���ڿ��� ���� �߰�
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		//index4 ��ġ�� 2�� ����
		sb.insert(4, "2");
		System.out.println(sb.toString());

		//index4 ��ġ�� ���ڸ� 6���� ����
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		
		//index6���� index13 ������(12������)�� "Book"���� ��ü
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());
		
		//index4���� index5 ������(index4��) ����
		sb.delete(4, 5);
		System.out.println(sb.toString());
		
		//�� ���� ��
		int length = sb.length();
		System.out.println("�� ���� ��: " + length);
		
		//���ۿ� �ִ� ���� StringŸ������ ����
		String result = sb.toString();
		System.out.println(result);	
		
	}
}