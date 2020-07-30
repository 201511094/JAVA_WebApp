package sec04;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	//public void setMemory(int memory) {
//	public synchronized void setMemory(int memory) {		//��ü ���
//		this.memory=memory;
//		try {Thread.sleep(2000);} 
//		catch (InterruptedException e) {}
//		System.out.println(Thread.currentThread().getName()+": "+this.memory);
//	}
	
	//����ȭ ���
	public void setMemory(int memory) {
		synchronized(this) {	//this�� ���
			this.memory=memory;
			try {Thread.sleep(2000);} 
			catch (InterruptedException e) {}
			System.out.println(Thread.currentThread().getName()+": "+this.memory);
		}
	}
	
}