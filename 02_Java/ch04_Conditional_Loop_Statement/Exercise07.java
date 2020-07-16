import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		boolean run=true;
		int balance=0;
		Scanner sc=new Scanner(System.in);
		
		while(run) {
			System.out.println("==========");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("==========");
			System.out.print("선택> ");
			
			int choice=sc.nextInt();
			int money;
			
			switch(choice) {
			case 1:
				System.out.print("예금액> ");
				money=sc.nextInt();
				balance += money;
				break;
			case 2:
				System.out.print("출금액> ");
				money=sc.nextInt();
				balance -= money;
				break;
			case 3:
				System.out.println("잔고> "+balance);
				break;
			case 4:
				run = false;
				break;
			default:
				System.out.println("올바른 번호를 입력해주세요.");
				break;
			}
		/*
			if (choice == 1) {
				System.out.print("예금액> ");
				int input=System.in.read();
				balance += input;
				
			} else if (choice == 2) {
				System.out.print("출금액> ");
				int input=System.in.read();
				balance -= input;
				
			} else if (choice == 3) {
				System.out.println("잔고> "+balance);
				
			} else if (choice == 4) {
				run = false;
			}
			else {
				System.out.println("올바른 번호를 입력해주세요.");
			}
		*/
		}
		System.out.println("프로그램 종료");
	}
}