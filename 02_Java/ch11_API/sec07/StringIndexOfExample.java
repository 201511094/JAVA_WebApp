package sec07;

public class StringIndexOfExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String subject = "�ڹ� ���α׷���";
		int location = subject.indexOf("���α׷���");
		System.out.println(location);
		
		if (subject.indexOf("�ڹ�") != -1) {
			//"�ڹ�"��� ���ڿ��� ������
			System.out.println("�ڹٰ� ���õ� å�Դϴ�.");
		}
		else {
			System.out.println("�ڹٰ� ���þ��� å�Դϴ�.");
		}
	}
	
}