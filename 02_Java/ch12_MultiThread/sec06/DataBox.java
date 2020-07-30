package sec06;

public class DataBox {
	private String data;
	
	public synchronized String getData() {
		if(this.data == null) {	//data�� null�̸� �Ͻ��������·� ����
			try {wait();}
			catch(InterruptedException e) {}
		}
		String returnValue = data;
		System.out.println("ConsummerThread�� ���� ������: " + returnValue);
		data = null;	
		notify();
		return returnValue;	//������ �����带 ��������·� ����
	}
	
	public synchronized void setData(String data) {
		if(this.data != null) {
			try {wait();}
			catch(InterruptedException e) {}
		}
		this.data = data;
		System.out.println("ProducerThread�� ������ ������: " + data);
		notify();
	}
	
}