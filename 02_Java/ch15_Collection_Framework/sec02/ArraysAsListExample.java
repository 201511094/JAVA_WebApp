package sec02;

import java.util.*;

public class ArraysAsListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1=Arrays.asList("홍길동", "신용권", "감자바");
		for (String name: list1) {
			System.out.println(name);
		}
		
		List<Integer> list2=Arrays.asList(1,2,3);
		for (int value: list2) {
			System.out.println(value);
		}
		
	}
	//고정된 String객체를 요소로 갖는 ArrayList객체를 생성하는 예제
	//T타입 파라미터에 맞게 asList()의 매개값을 순차적으로 입력하거나 T[]배열을 매개값으로 주면 됨
}