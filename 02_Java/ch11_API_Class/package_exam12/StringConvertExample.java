package package_exam12;

public class StringConvertExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strData1 = "200";
		int intData1 = Integer.parseInt(strData1);	//���ڿ��� ������ ��ȯ
		
		int intData2 = 150;
		String strData2 = String.valueOf(intData2);	//���ڸ� ���ڿ��� ��ȯ
		
		System.out.println(intData1+"\n"+strData2);
	}
}