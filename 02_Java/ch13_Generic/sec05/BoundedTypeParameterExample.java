package sec05;

public class BoundedTypeParameterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str=Util.compare("a", "b");	//String은 Number타입이 아님
		
		//타입 파라미터를 명시한 경우
		int result1=Util.compare(10, 20);	//앞이 크면 1, 뒤가 크면 -1
		int result2=Util.<Number>compare(4.5, 3);
		int result3=Util.<Integer>compare((int)4.5, 5);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}