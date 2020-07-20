
public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc;	//RemoteControl타입 변수 선언
		//구현 객체 대입
		//구현 객체를 인터페이스 변수에 대입해서 사용
		rc = new Television();
		rc = new Audio();
	}
}