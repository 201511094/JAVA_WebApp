package package_exam10;

import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		//TreeSet에 Student객체를 저장, Student의 score필드값으로 자동 정렬
		TreeSet<Student> treeSet = new TreeSet<Student>();
		treeSet.add(new Student("blue", 96));
		treeSet.add(new Student("hong", 86));
		treeSet.add(new Student("white", 92));
		
		Student student = treeSet.last();	//last()호출 시 가장 높은 score의 Student객체가 리턴
		System.out.println("최고점수: " + student.score);
		System.out.println("최고점수를 받은 아이디: " + student.id);
		
	}
}
