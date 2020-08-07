
public class MyExceptionTest {
	private String accountNo;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String accountNo=new MyExceptionTest().accountNo;
		try {
			if (accountNo==null) {
				throw new MyException("에러발생", accountNo);
			}
			else {
				System.out.println("정상처리");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			if (e instanceof MyException) {
				System.out.println(((MyException) e).getAccountNo());
			}
		}
		
	}
}