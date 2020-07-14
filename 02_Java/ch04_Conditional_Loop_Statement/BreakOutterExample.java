
public class BreakOutterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//중첩된 반복문을 모두 종료하기 위해 이름(라벨)을 붙임
		Outter: for (char upper='A'; upper<='Z'; upper++) {
			for (char lower='a'; lower<='z'; lower++) {
				System.out.println(upper+"-"+lower);
				if (lower == 'g') {
					break Outter;
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}
}