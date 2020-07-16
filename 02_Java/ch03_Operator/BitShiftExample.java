
public class BitShiftExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1 << 3 = " + (1<<3));	//1 * 2^3	
		System.out.println("-8 >> 3 = " + (-8>>3));	//빈공간에 채워넣는 값이 1(MSB)
		System.out.println("-8 >>> 3 = " + (-8>>>3));	//0으로 채워넣기

		System.out.println("3 << 5 = " + (3<<5));		//3 * 2^5
		System.out.println("-21 >> 4 = " + (-21>>4));	//빈공간에 채워넣는 값이 1(MSB)
		System.out.println("-21 >>> 4 = " + (-21>>>4));	//0으로 채워넣기
	}
}