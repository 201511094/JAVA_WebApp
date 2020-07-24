
public class ThrowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//main()메소드에서 try-catch블록으로 예외를 최종 처리
		try {
			findClass();
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
	
	//throws - 예외 처리 떠넘기기
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}
}