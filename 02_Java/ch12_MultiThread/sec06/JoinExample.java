package sec06;

public class JoinExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumThread sumThread=new SumThread();
		sumThread.start();
		
		try {sumThread.join();}	//sumThread������ ������ ���ν����� �Ͻ�����
		catch (InterruptedException e) {}
		
		System.out.println("1 ~ 100 ��: "+sumThread.getSum());
		
	}
	//�ٸ� �����尡 ����� ������ �Ͻ����� ���� ����
}