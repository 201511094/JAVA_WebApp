package sec03;
/*
public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//셋 다 Member타입
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if (obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		}
		else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
		
		if (obj1.equals(obj3)) {
			System.out.println("obj1과 obj3은 동등합니다.");
		}
		else {
			System.out.println("obj1과 obj3은 동등하지 않습니다.");
		}
	}
}
*/

//얕은 복제
/*
public class MemberExample {
	public static void main(String[] args) {
		//원본 객체 생성
		Member original = new Member("blue", "홍길동", "12345", 25, true);
		
		//복제 객체에서 패스워드 변경
		Member cloned = original.getMember();
		cloned.password = "67890";
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("id: " + cloned.id);
		System.out.println("name: " + cloned.name);
		System.out.println("password: " + cloned.password);
		System.out.println("age: " + cloned.age);
		System.out.println("adult: " + cloned.adult+'\n');
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println("id: " + original.id);
		System.out.println("name: " + original.name);
		System.out.println("password: " + original.password);	//원본값은 변함 없음
		System.out.println("age: " + original.age);
		System.out.println("adult: " + original.adult);
	}
}
*/

//깊은 복제
public class MemberExample {
	public static void main(String[] args) {
		//원본 객체 생성
		Member original = new Member("홍길동", 25, new int[] {90, 90}, new Car("소나타"));
		
		//깊은 복제 후 참조 객체의 데이터 변경
		Member cloned = original.getMember();
		cloned.scores[0] = 100;
		cloned.car.model = "그랜저";
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("name: " + cloned.name);
		System.out.println("age: " + cloned.age);
		System.out.print("scores: {");
		for(int i=0; i<cloned.scores.length; i++) {
			System.out.print(cloned.scores[i]);
			System.out.print((i==(cloned.scores.length-1))?"":",");
		}
		System.out.println("}");
		System.out.println("car: " + cloned.car.model+'\n');
		
		System.out.println("[원본 객체의 필드값]");
		System.out.println("name: " + original.name);
		System.out.println("age: " + original.age);
		System.out.print("scores: {");
		for(int i=0; i<original.scores.length; i++) {
			System.out.print(original.scores[i]);
			System.out.print((i==(original.scores.length-1))?"":",");
		}
		System.out.println("}");
		System.out.println("car: " + original.car.model);
	}
}