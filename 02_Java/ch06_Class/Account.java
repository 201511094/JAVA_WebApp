
public class Account {
	
//	public static final int MIN_BALANCE = 0;
//	public static final int MAX_BALANCE = 1000000;
//	int balance;
//
//	public void setBalance(int balance) {
//		// TODO Auto-generated method stub
//		if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
//			this.balance = balance;
//		}
//		//또는
////		if (i < MIN_BALANCE || i > MAX_BALANCE) {
////			return;
////		}
////		this.balance = balance;
//	}
//	public int getBalance() {
//		// TODO Auto-generated method stub
//		return balance;
//	}

	
	
	private String ano;
	private String owner;
	private int balance;
	
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getAno() { return ano; }
	public void setAno(String ano) { this.ano = ano; }
	public String getOwner() { return owner; }
	public void setOwner(String owner) { this.owner = owner; }
	public int getBalance() { return balance; }
	public void setBalance(int balance) { this.balance = balance; }
}