package sec09;

import java.util.concurrent.*;

public class ExecuteVsSubmitExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//최대 스레드 개수가 2인 스레드풀 생성
		ExecutorService executorService=Executors.newFixedThreadPool(2);
		
		for (int i=0;i<10;i++) {
			//익명 객체 만들기
			Runnable runnable=new Runnable() {
				@Override
				public void run() {
					// TODO Auto-generated method stub
					//스레드 총 개수 및 작업 스레드 이름 출력
					ThreadPoolExecutor threadPoolExecutor=(ThreadPoolExecutor)executorService;
					int poolSize=threadPoolExecutor.getPoolSize();
					String threadName=Thread.currentThread().getName();
					System.out.println("[총 스레드 개수: "+poolSize+"] 작업 스레드 이름: "+threadName);
					//예외 발생
					int value=Integer.parseInt("3");
					System.out.println(value);
				}
			};
			
			//작업처리 요청
			executorService.execute(runnable);
			//executorService.submit(runnable);
			
			Thread.sleep(10);
		}
		executorService.shutdown();//스레드풀 종료
		
	}
}