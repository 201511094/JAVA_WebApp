
public class BitReverseOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1 + 1;
		System.out.print(toBinaryString(v1) + " (������: " + v1 + ")\n");
		System.out.print(toBinaryString(v2) + " (������: " + v2 + ")\n");
		System.out.print(toBinaryString(v3) + " (������: " + v3 + ")\n");
		
		int v4 = -10;
		int v5 = ~v4;
		int v6 = ~v4 + 1;
		System.out.print(toBinaryString(v4) + " (������: " + v4 + ")\n");
		System.out.print(toBinaryString(v5) + " (������: " + v5 + ")\n");
		System.out.print(toBinaryString(v6) + " (������: " + v6 + ")\n");
	}
	
	//�������� 32��Ʈ�� �������ڿ��� �����ϴ� �޼ҵ�
	public static String toBinaryString(int value) {
		String str=Integer.toBinaryString(value);
		while(str.length() < 32) {
			str="0"+str;
		}
		return str;
	}
}