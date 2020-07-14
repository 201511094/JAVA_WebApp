
public class ForSumFrom1To100Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println("1~100까지의 합 : " + sum);
	
	/*
		int sum = 0; 
		int i = 0;
		
		for(i=1; i<=100; i++) {
			sum += i;
		}	//for문을 빠져나오면서 i=101이 됨
		System.out.println("1 ~ " + (i-1) + "까지의 합: " + sum);
	*/
		
	}
}