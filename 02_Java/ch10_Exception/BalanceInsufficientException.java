
public class BalanceInsufficientException extends Exception {
	public BalanceInsufficientException() {}	//�⺻ ������
	public BalanceInsufficientException(String message) {
		super(message);	//���� �޽����� �����ϱ� ���� ������, �޽����� ���� ó�� �ڵ忡�� ���
	}	
}