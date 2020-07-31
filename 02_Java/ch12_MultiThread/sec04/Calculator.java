package sec04;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	
	//public void setMemory(int memory) {
//	public synchronized void setMemory(int memory) {		//객체 잠금
//		this.memory=memory;
//		try {Thread.sleep(2000);} 
//		catch (InterruptedException e) {}
//		System.out.println(Thread.currentThread().getName()+": "+this.memory);
//	}
	
	//동기화 블록
	public void setMemory(int memory) {
		synchronized(this) {	//this를 잠금
			this.memory=memory;
			try {Thread.sleep(2000);} 
			catch (InterruptedException e) {}
			System.out.println(Thread.currentThread().getName()+": "+this.memory);
		}
	}
	
}