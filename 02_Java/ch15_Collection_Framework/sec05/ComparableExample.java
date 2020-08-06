package sec05;

import java.util.*;

public class ComparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		//저장 시 나이순으로 저장됨
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("감자바", 25));
		treeSet.add(new Person("박지원", 31));
		treeSet.add(new Person("kjh", 24));
		
		//오름차순으로 가져오기
		Iterator<Person> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + ": " + person.age);
		}
		
	}
	//사용자 정의 객체를 나이 순으로 정렬하기 예제
	//나이를 기준으로 Person객체를 오름차순으로 정렬하기 위해 Comparable인터페이스를 구현
}