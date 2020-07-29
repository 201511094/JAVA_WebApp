package package_exam12;

public class StringConvertExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strData1 = "200";
		int intData1 = Integer.parseInt(strData1);	//문자열을 정수로 변환
		
		int intData2 = 150;
		String strData2 = String.valueOf(intData2);	//숫자를 문자열로 변환
		
		System.out.println(intData1+"\n"+strData2);
	}
}