package sec04;

import java.util.*;

public class HashMapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Student, Integer> map=new HashMap<Student, Integer>();
		
		//학번과 이름이 동일한 Student를 키로 저정
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 95);
		
		System.out.println("총 Entry 수: " + map.size());
		
	}
	//Student를 키로하고 점수를 저장하는 HashMap 사용 방법 예제
	//Student클래스에서 hashCode()와 equals()메소드가 재정의됨
	//학번과 이름이 동일한 경우 같은 키로 인식
}