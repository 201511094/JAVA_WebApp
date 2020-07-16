
public class Account {
	
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	
	int balance;

	public void setBalance(int balance) {
		// TODO Auto-generated method stub
		if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
			this.balance = balance;
		}
		
		//또는
//		if (i < MIN_BALANCE || i > MAX_BALANCE) {
//			return;
//		}
//		this.balance = i;
	}

	public int getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}
}