package package_exam09;

public class StringBuilderExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 ~ 100������ ���ڸ� ���ڿ��� �����
		String str="";
		for(int i=1; i<=100; i++) {
			str += i;		//+=������ 100�� �ݺ�
		}
		System.out.println(str);
		
		//���� �ڵ� - StringBuilder
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=100; i++) {
			sb.append(i);
		}
		str = sb.toString();
		System.out.println(str);
	}
}