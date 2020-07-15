
public class Calculator {
	//메소드
//	void powerOn() {
//		System.out.println("전원을 켭니다.");
//	}
//	int plus(int x, int y) {
//		int result = x + y;
//		return result;
//	}
//	double divide(int x, int y) {
//		double result = (double)x / (double)y;
//		return result;
//	}
//	//리턴값 없음
//	void powerOff() {
//		System.out.println("전원을 끕니다.");
//	}
	
	int plus(int x, int y) {
		int result=x+y;
		return result;
	}
	double avg(int x, int y) {
		double sum=plus(x,y);	//plus메소드 호출
		double result=sum/2;
		return result;
	}
	void execute() {
		double result=avg(7,10);	//avg메소드 호출
		println("실행결과: "+result);
	}
	void println(String message) {
		System.out.println(message);
	}
	
}