import java.io.IOException;

public class WhileKeyControlExample {

	//throw Exception�� System.in.read()�޼ҵ忡 ����  ����ó���ڵ�
	public static void main(String[] args) throws Exception {	
		// TODO Auto-generated method stub
		boolean run = true;		
		int speed = 0;
		int keyCode = 0;
		
		//�޴�
		while (run) {
			if (keyCode!=13 && keyCode!=10) {	//13�� ĳ��������, 10�� �����ǵ�
				System.out.println("==========");
				System.out.println("1. ���� | 2. ���� | 3. ����");
				System.out.println("==========");
				System.out.print("����: ");
			}
			
			keyCode = System.in.read();
			
			if (keyCode == 49) {		//1
				speed++;
				System.out.println("���� �ӵ�=" + speed);
			} else if (keyCode == 50) {	//2
				speed--;
				System.out.println("���� �ӵ�=" + speed);
			} else if (keyCode == 51) { //3
				run = false;
			}
		}			
		System.out.println("���α׷� ����");
		
	}
}