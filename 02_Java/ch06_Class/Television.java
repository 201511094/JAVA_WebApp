
public class Television {
	static String company="Samsung";
	static String model="LCD";
	static String info;
	
	//코드 추가
	String name;
	int productYear;

	static String getCompany() {
		//Television t = new Television();
		this.name="kjh";	//1 - this키워드는 객체 자신의 참조. static에서 사용 불가
		//t.name="kjh";
		return company;
	}
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		name=name;	//4
		//this.name=name;
	}
	
	//static block - static초기화를 하는 곳
	static {
		info=company+" - "+model;
		name="kjh";  //2 - name필드는 static이 아니기 때문
		productYear=2020;	//3 - 2번과 동일
	}
}

//static필드는 객체를 생성하지 않고 사용할 수 있는 필드
//static메소드는 객체를 생성하지 않고 사용할 수 있는 메소드
//정적멤버 == 클래스멤버 -> true