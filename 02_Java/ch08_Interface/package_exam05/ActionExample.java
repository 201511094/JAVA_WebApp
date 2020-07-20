package package_exam05;

public class ActionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Action action = new Action() {
			@Override	//써주면 좋음
			public void work() {
				System.out.println("복사를 합니다.");
			}
		};
		action.work();
	}
}