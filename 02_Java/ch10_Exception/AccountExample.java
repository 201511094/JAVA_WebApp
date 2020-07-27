
public class AccountExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account = new Account();
		
		//예금
		account.deposit(10000);
		System.out.println("예금액: "+account.getBalance());
		//출금
		try {
			account.withdraw(30000);
		} catch(BalanceInsufficientException e) {
			String message = e.getMessage();	//message="잔고부족: 20000원 모자람"
			System.out.println(message+'\n');
			e.printStackTrace();
		}
	}
}