package sec03;

public class Counter {
	private int no;
	
	public Counter(int no) {
		this.no = no;
	}
	
	//finalize()�޼ҵ� ������
	@Override
	protected void finalize() throws Throwable {
		System.out.println(no+"�� ��ü�� finalize()�� �����");
	}
	
}