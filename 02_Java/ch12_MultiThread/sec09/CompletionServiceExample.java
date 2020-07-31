package sec09;

import java.util.concurrent.*;

public class CompletionServiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CompletionService 생성
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors()
			);
			
			CompletionService<Integer> completionService  = 
					new ExecutorCompletionService<Integer>(executorService);
			
			System.out.println("[작업 처리 요청]");
			for(int i=0; i<3; i++) {
				//스레드풀에게 작업 처리 요청
				completionService.submit(new Callable<Integer>() {
					@Override
					public Integer call() throws Exception {
						int sum = 0;
						for(int i=1; i<=10; i++) {
							sum += i;
						}
						return sum;
					}
				});
			}
			
			System.out.println("[처리 완료된 작업 확인]");
			//스레드풀의 스레드에서 실행하도록
			executorService.submit(new Runnable() {
				@Override
				public void run() {
					while(true) {
						try {
							Future<Integer> future = completionService.take();	//완료된 작업 가져오기
							int value = future.get();
							System.out.println("[처리 결과] " + value);
						} catch (Exception e) {
							break;
						}
					}
				}
			});
			
			//3초후 스레드풀 종료
			try {Thread.sleep(3000);}
			catch (InterruptedException e) {}
			executorService.shutdownNow();
			
	}
}