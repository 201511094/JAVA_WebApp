package sec03;

import java.util.*;

public class HashSetExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Member> set=new HashSet<Member>();
		
		//인스턴스가 다르지만 내부 데이터가 같아서 객체 1개만을 저장
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		
		System.out.println("총 객체수 : " + set.size());
		
	}
	//Member클래스에서 hashCode()와 equals()를 오버라이딩
	//인스턴스가 달라도 이름과 나이가 동일하면 동일한 객체로 간주하여 중복 저장을 막음
}