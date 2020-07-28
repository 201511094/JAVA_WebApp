package sec11;

import java.util.Arrays;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr1 = {'J', 'A', 'V', 'A'};
		
		//방법1
		char[] arr2 = Arrays.copyOf(arr1, arr1.length);	//전체 복사
		System.out.println(Arrays.toString(arr2));
		
		//방법2
		char[] arr3 = Arrays.copyOfRange(arr1, 1, 3);	//arr[1~2] -> arr3[0~1]
		System.out.println(Arrays.toString(arr3));
		
		//방법3
		char[] arr4 = new char[arr1.length];
		System.arraycopy(arr1, 0, arr4, 0, arr1.length);	//전체 복사
		for (int i=0; i<arr4.length; i++) {
			System.out.println("arr4["+i+"] = "+arr4[i]);
		}
	}
}