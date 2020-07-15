
public class ArrayCopyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] oldIntArray = { "Java", "array", "copy" };
		String[] newIntArray = new String[5];
		
		//원본 배열, 원본 배열 시작인덱스, 새 배열, 새 배열 시작인덱스, 복사할 개수
		System.arraycopy(oldIntArray, 0, newIntArray, 0, oldIntArray.length);
		
		for (int i=0;i<newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");
		}
	}
}