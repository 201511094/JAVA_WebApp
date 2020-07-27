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

//Cloneable 명시 - 복제 허용
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