import java.util.Scanner;

public class BankApplication {

	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		
		while(run) {
			System.out.println("==========");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("==========");
			System.out.print("선택> ");
			
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) {
				createAccount();
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	//계좌생성하기
	private static void createAccount() {
		String ano;
		String owner;
		int balance;
		
		System.out.println("==========");
		System.out.println("계좌생성");
		System.out.println("==========");
		
		System.out.print("계좌번호: ");
		ano = scanner.next();
		System.out.print("계좌주: ");
		owner = scanner.next();
		System.out.print("초기입금액: ");
		balance = scanner.nextInt();
		
		//객체생성
		Account ac = new Account(ano, owner, balance);
		//배열에 넣기
		for (int i=0; i<accountArray.length; i++) {
			if (accountArray[i] == null) {
				accountArray[i] = ac;
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}
	}
	
	//계좌목록보기 OK
	private static void accountList() {
		System.out.println("==========");
		System.out.println("계좌목록");
		System.out.println("==========");
		
		for (int i=0; i<accountArray.length; i++) {
			if (accountArray[i] != null) {
				System.out.printf("%-8s", accountArray[i].getAno());
				System.out.printf("%5s", accountArray[i].getOwner());
				System.out.printf("%8d", accountArray[i].getBalance());
				System.out.println();
			}
		}
	}
	
	//예금하기
	private static void deposit() {
		System.out.println("==========");
		System.out.println("예금");
		System.out.println("==========");
		
		System.out.print("계좌번호: ");
		String num=scanner.next();
		System.out.print("예금액: ");
		int money=scanner.nextInt();
		
		Account ac = findAccount(num);
		if (ac != null) {
			ac.setBalance(ac.getBalance()+money);
			System.out.println("결과: 예금을 완료했습니다.");
		}
		else {
			System.out.println("결과: 예금 실패. 계좌가 올바르지 않습니다.");
			return;
		}
	}
	
	//출금하기
	private static void withdraw() {

		System.out.println("==========");
		System.out.println("출금");
		System.out.println("==========");
		
		System.out.print("계좌번호: ");
		String num=scanner.next();
		System.out.print("출금액: ");
		int money=scanner.nextInt();
		
		Account ac = findAccount(num);
		if (ac != null) {
			ac.setBalance(ac.getBalance()-money);
			System.out.println("결과: 출금을 완료했습니다.");
		}
		else {
			System.out.println("결과: 출금 실패. 계좌가 올바르지 않습니다.");
			return;
		}
	}
	
	//Account배열에서 ano와 동일한 Account객체 찾기
	private static Account findAccount(String ano) {
		Account ac = null;
		for (int i=0; i<accountArray.length; i++) {
			if (accountArray[i] != null) {
				String temp = accountArray[i].getAno();
				if (ano.equals(temp)) {	//문자열 비교
					ac = accountArray[i];
					break;
				}
			}
		}
		return ac;
	}
}