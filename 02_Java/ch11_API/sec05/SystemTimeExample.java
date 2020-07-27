package sec05;

public class SystemTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time1 = System.nanoTime();	//시작 시간
		
		int sum = 0;
		for(int i=1; i<=1000000; i++) {
			sum += i;
		}
		
		long time2 = System.nanoTime();	//끝 시간
		
		System.out.println("1 ~ 1000000까지의 합: " + sum);
		System.out.println("계산에 " + (time2-time1) + " 세컨드가 소요되었습니다.");
		
	}
}