package sec13;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ù�ȣ
		int[] selectNumber=new int[6];	//���ù�ȣ 6��
		Random random=new Random(3);
		System.out.print("���� ��ȣ: ");
		for (int i=0; i<6; i++) {
			selectNumber[i]=random.nextInt(45)+1;
			System.out.print(selectNumber[i]+" ");
		}
		System.out.println();
		
		//��÷��ȣ
		int[] winningNumber=new int[6];	//��÷��ȣ 6��
		random=new Random(5);
		System.out.print("���� ��ȣ: ");
		for (int i=0; i<6; i++) {
			winningNumber[i]=random.nextInt(45)+1;
			System.out.print(winningNumber[i]+" ");
		}
		System.out.println();
		
		//��÷���� - ���Ľ�Ű�� ��
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber);	//�迭 �׸� �� ��
		System.out.print("��÷ ����: ");
		if (result == true) {
			System.out.println("1�� ��÷!");
		}
		else {
			System.out.println("��÷���� �ʾҽ��ϴ�.");
		}
	}
}