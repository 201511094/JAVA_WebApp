package sec03;

public class FinalizeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter counter = null;
		for (int i=0; i<50; i++) {
			counter = new Counter(i);
			
			counter = null;	//counter객체를 쓰레기로 만듦
			System.gc();//Garbage Collector 실행 요청
		}
	}
}