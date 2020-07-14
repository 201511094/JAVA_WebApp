
public class CheckOverflowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Integer.MIN_VALUE값: "+Integer.MIN_VALUE);
		System.out.println("Integer.MAX_VALUE값: "+Integer.MAX_VALUE);
		
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		} catch(ArithmeticException e) {
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음");
		}
	}
	//안전한 값만 계산
	public static int safeAdd(int left, int right)  {
		if(right > 0) { 
			if(left > (Integer.MAX_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}
		else {
			if(left < (Integer.MIN_VALUE - right)) {
				throw new ArithmeticException("오버플로우 발생");
			}
		}
		
		return left + right;
	}
}
