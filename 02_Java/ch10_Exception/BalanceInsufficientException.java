
public class BalanceInsufficientException extends Exception {
	public BalanceInsufficientException() {}	//기본 생성자
	public BalanceInsufficientException(String message) {
		super(message);	//예외 메시지를 전달하기 위한 생성자, 메시지는 예외 처리 코드에서 사용
	}	
}