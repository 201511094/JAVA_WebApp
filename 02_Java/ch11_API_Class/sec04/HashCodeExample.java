package sec04;

import java.util.Objects;

public class HashCodeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1, "kjh");
		Student s2 = new Student(1, "kjh");
		
		System.out.println(s1.hashCode());
		System.out.println(Objects.hashCode(s2));
	}
	
	static class Student {
		int sno;
		String name;
		
		Student(int sno, String name) {
			this.sno=sno;
			this.name=name;
		}
		
		//학생 번호와 이름이 동일하면 같은 해시 코드를 얻을 수 있음
		@Override
		public int hashCode() {
			return Objects.hash(sno, name);
		}
	}
	
}