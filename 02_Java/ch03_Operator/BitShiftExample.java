
public class BitShiftExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1 << 3 = " + (1<<3));	//1 * 2^3	
		System.out.println("-8 >> 3 = " + (-8>>3));	//������� ä���ִ� ���� 1(MSB)
		System.out.println("-8 >>> 3 = " + (-8>>>3));	//0���� ä���ֱ�

		System.out.println("3 << 5 = " + (3<<5));		//3 * 2^5
		System.out.println("-21 >> 4 = " + (-21>>4));	//������� ä���ִ� ���� 1(MSB)
		System.out.println("-21 >>> 4 = " + (-21>>>4));	//0���� ä���ֱ�
	}
}