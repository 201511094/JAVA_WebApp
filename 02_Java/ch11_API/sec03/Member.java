package sec03;

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