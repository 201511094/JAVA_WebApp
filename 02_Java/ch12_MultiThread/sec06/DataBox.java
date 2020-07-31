package sec06;

public class DataBox {
	private String data;
	
	public synchronized String getData() {
		if(this.data == null) {	//data가 null이면 일시정지상태로 만듦
			try {wait();}
			catch(InterruptedException e) {}
		}
		String returnValue = data;
		System.out.println("ConsummerThread가 읽은 데이터: " + returnValue);
		data = null;	
		notify();
		return returnValue;	//생산자 스레드를 실행대기상태로 만듦
	}
	
	public synchronized void setData(String data) {
		if(this.data != null) {
			try {wait();}
			catch(InterruptedException e) {}
		}
		this.data = data;
		System.out.println("ProducerThread가 생성한 데이터: " + data);
		notify();
	}
	
}