package package_exam04;

public class Member {
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	//Object의 toString() 오버라이딩
	@Override
	public String toString() {
		String str = id + ": " + name;
		return str;
	}
	
}