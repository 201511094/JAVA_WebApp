
public class TryCatchFinallyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//try {
			Class clazz = Class.forName("java.lang.String2");	//java.lang.String2 클래스 존재안함
			
		//} catch (ClassNotFoundException e) {	//Exception이 전혀 발생하지 않아서 오류
			System.out.println("클래스가 존재하지 않습니다.");
		//} finally {
		//	System.out.println("잘 처리됨");
		//}
	}
}

//에러가 발생 안하도록 추가한 클래스
class Class {
	public static Class forName(String arg) {
		Class ex = new Class();
		return ex;
	}
}