
public class StudentExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		System.out.println("s1 변수가 Student객체를 참조합니다.");
		
		System.out.println("==========");
		Student s2=new Student();
		System.out.println("s2의 나이: "+s2.age);
		System.out.println("s2의 이름: "+s2.name);
		
		System.out.println("==========");
		Student s3=new Student(20);
		System.out.println("s3의 나이: "+s3.age);
		System.out.println("s3의 이름: "+s3.name);
		
		System.out.println("==========");
		Student s4=new Student();
		s4.setAge(27);
		s4.setName("ezen");
		System.out.println("s4의 나이: "+s4.age);
		System.out.println("s4의 이름: "+s4.name);
		
	}
}