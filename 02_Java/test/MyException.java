
public class MyException extends Exception {
	private String accountNo;
	
	public MyException(String msg, String accountNo) {
		super(msg);
		this.accountNo=accountNo;
	}
	
	public String getAccountNo() {
		return accountNo;
	}
	
}