package package_exam08;

public class MovieThread extends Thread{
	@Override
	public void run() {
		while (true) {
			System.out.println("동영상을 재생합니다.");
			//MovieThread의 interrupt()를 통해 MovieThread를 안전하게 종료
			if (this.isInterrupted()) {
				break;
			}
		}
	}
	
}