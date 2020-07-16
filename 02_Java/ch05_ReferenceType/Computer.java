
public class Computer {
	//메소드의 매개변수 수를 모를 경우
	int sum1(int[] values) {	//배열로 넘겨줌
		int sum=0;
		for (int i=0;i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
	int sum2(int ... values) {	//'...'로 선언된 매개변수는 배열타입, 배열생성 없이 리스트만 넘겨줌
		int sum=0;
		for (int i=0;i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
}