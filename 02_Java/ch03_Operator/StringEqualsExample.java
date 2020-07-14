
public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1 = "kjh";
		String strVar2 = "kjh";
		String strVar3 = new String("kjh");

		//변수에 저장된 값만 비교
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);	//false
		
		//객체에 상관없이 String객체의 문자열만 비교
		//equals메소드는 원본문자열과 매개값으로 주어진 비교문자열이 동일한지 비교
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
	}
}