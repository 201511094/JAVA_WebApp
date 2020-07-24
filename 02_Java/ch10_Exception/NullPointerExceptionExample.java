
public class NullPointerExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data=null;
		try {
			//NullPointerException
			System.out.println(data.toString());
			
		} catch (NullPointerException e) {
			System.out.println("NullPointerException 예외 발생");
			
		} finally {
			System.out.println("프로그램 종료");
		}
	}
}