
public class ArrayCopyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] oldIntArray = { "Java", "array", "copy" };
		String[] newIntArray = new String[5];
		
		//���� �迭, ���� �迭 �����ε���, �� �迭, �� �迭 �����ε���, ������ ����
		System.arraycopy(oldIntArray, 0, newIntArray, 0, oldIntArray.length);
		
		for (int i=0;i<newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");
		}
	}
}