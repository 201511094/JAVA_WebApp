package package_exam09;

public class StringBuilderExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 ~ 100까지의 숫자를 문자열로 만들기
		String str="";
		for(int i=1; i<=100; i++) {
			str += i;		//+=연산자 100번 반복
		}
		System.out.println(str);
		
		//개선 코드 - StringBuilder
		StringBuilder sb = new StringBuilder();
		for(int i=1; i<=100; i++) {
			sb.append(i);
		}
		str = sb.toString();
		System.out.println(str);
	}
}