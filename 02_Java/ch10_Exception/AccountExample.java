
public class AccountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		
		//����
		account.deposit(10000);
		System.out.println("���ݾ�: "+account.getBalance());
		//���
		try {
			account.withdraw(30000);
		} catch(BalanceInsufficientException e) {
			String message = e.getMessage();	//message="�ܰ����: 20000�� ���ڶ�"
			System.out.println(message+'\n');
			e.printStackTrace();
		}
	}
}