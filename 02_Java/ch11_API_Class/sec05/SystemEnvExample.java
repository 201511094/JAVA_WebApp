package sec05;

public class SystemEnvExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//JAVA_HOME ȯ�� ������ ���� ���� ���
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println("JAVA_HOME: "+javaHome);
		
	}
}