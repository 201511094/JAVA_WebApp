import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		boolean run=true;
		int balance=0;
		Scanner sc=new Scanner(System.in);
		
		while(run) {
			System.out.println("==========");
			System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. ����");
			System.out.println("==========");
			System.out.print("����> ");
			
			int choice=sc.nextInt();
			int money;
			
			switch(choice) {
			case 1:
				System.out.print("���ݾ�> ");
				money=sc.nextInt();
				balance += money;
				break;
			case 2:
				System.out.print("��ݾ�> ");
				money=sc.nextInt();
				balance -= money;
				break;
			case 3:
				System.out.println("�ܰ�> "+balance);
				break;
			case 4:
				run = false;
				break;
			default:
				System.out.println("�ùٸ� ��ȣ�� �Է����ּ���.");
				break;
			}
		/*
			if (choice == 1) {
				System.out.print("���ݾ�> ");
				int input=System.in.read();
				balance += input;
				
			} else if (choice == 2) {
				System.out.print("��ݾ�> ");
				int input=System.in.read();
				balance -= input;
				
			} else if (choice == 3) {
				System.out.println("�ܰ�> "+balance);
				
			} else if (choice == 4) {
				run = false;
			}
			else {
				System.out.println("�ùٸ� ��ȣ�� �Է����ּ���.");
			}
		*/
		}
		System.out.println("���α׷� ����");
	}
}