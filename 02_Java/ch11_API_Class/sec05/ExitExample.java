package sec05;

public class ExitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//보안 관리자 설정
		System.setSecurityManager(new SecurityManager() {
			@Override
			public void checkExit(int status) {
				//종료 상태값이 5일 경우에만 프로세스를 종료
				if (status != 5) {
					throw new SecurityException();
				}
			}
		});
		
		for (int i=0; i<10; i++) {
			System.out.println(i);
			try {
				System.exit(i);//JVM 종료 요청
			} catch(SecurityException e) {}
		}
	}
}