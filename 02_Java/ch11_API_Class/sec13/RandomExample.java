package sec13;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//선택번호
		int[] selectNumber=new int[6];	//선택번호 6개
		Random random=new Random(3);
		System.out.print("선택 번호: ");
		for (int i=0; i<6; i++) {
			selectNumber[i]=random.nextInt(45)+1;
			System.out.print(selectNumber[i]+" ");
		}
		System.out.println();
		
		//당첨번호
		int[] winningNumber=new int[6];	//당첨번호 6개
		random=new Random(5);
		System.out.print("선택 번호: ");
		for (int i=0; i<6; i++) {
			winningNumber[i]=random.nextInt(45)+1;
			System.out.print(winningNumber[i]+" ");
		}
		System.out.println();
		
		//당첨여부 - 정렬시키고 비교
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber);	//배열 항목 값 비교
		System.out.print("당첨 여부: ");
		if (result == true) {
			System.out.println("1등 당첨!");
		}
		else {
			System.out.println("당첨되지 않았습니다.");
		}
	}
}