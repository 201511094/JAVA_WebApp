
public class Student {
	String name;
	int age;
	
	Student() {
		age=25;
		name="kjh";
	}
	Student(int i) {
		age=i;
		name="없어요";
	}
	
	void setName(String s) {
		name=s;
	}
	void setAge(int i) {
		age=i;
	}
}