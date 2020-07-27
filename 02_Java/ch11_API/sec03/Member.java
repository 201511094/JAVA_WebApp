package sec03;
/*
public class Member {
	public String id;
	
	public Member(String id) {
		this.id=id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {	//매개값 타입 확인
			Member member = (Member) obj;	//강제 타입 변환
			if (id.equals(member.id)) {	//id필드값이 동일한지 검사
				return true;
			}
		}
		
		return false;
	}
	
	//hashCode() 오버라이딩
	//id가 동일한 문자열인 경우 같은 해시 코드를 리턴
	@Override
	public int hashCode() {
		return id.hashCode();
	}
	
}
*/

//얕은 복제
//Cloneable 명시 - 복제 허용
/*
public class Member implements Cloneable {
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	public Member(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	public Member getMember() {
		Member cloned = null;
		
		try {
			cloned = (Member) clone();
		} catch (CloneNotSupportedException e) {}
		
		return cloned;
	}
}
*/

import java.util.Arrays;
//깊은 복제
public class Member implements Cloneable {
	public String name;
	public int age;
	//참조 타입 필드, 깊은 복제 대상
	public int[] scores;
	public Car car;
	
	public Member(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//우선 Object의 clone()을 호출하여 얕은 복사 수행
		Member cloned = (Member)super.clone();
		//clone()메소드 재정의
		//scores 깊은 복제
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		//car 깊은 복제
		cloned.car = new Car(this.car.model);
		//Member객체 리턴
		return cloned;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();	//재정의된 clone()메소드 호출
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return cloned;
	}
	
}