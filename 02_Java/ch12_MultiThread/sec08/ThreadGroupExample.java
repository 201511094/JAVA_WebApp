package sec08;

public class ThreadGroupExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroup myGroup=new ThreadGroup("myGroup");
		WorkThread workThreadA=new WorkThread(myGroup, "workThreadA");
		WorkThread workThreadB=new WorkThread(myGroup, "workThreadB");
		
		workThreadA.start();
		workThreadB.start();
		System.out.println("[main스레드 그룹의 list()메소드 출력내용]");
		ThreadGroup mainGroup=Thread.currentThread().getThreadGroup();
		System.out.println();
		
		try {Thread.sleep(3000);}
		catch (InterruptedException e) {}
		
		System.out.println("[myGroup스레드 그룹의 interrupt()메소드 호출]");
		myGroup.interrupt();
		
	}
}