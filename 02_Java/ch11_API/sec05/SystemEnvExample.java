package sec05;

public class SystemEnvExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JAVA_HOME 환경 변수의 값을 얻어와 출력
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println("JAVA_HOME: "+javaHome);
		
	}
}