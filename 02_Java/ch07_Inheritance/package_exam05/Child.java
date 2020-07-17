package package_exam05;

public class Child extends Parent {
	private int studentNo;
	
	public Child(String name, int studentNo) {
		super(name);	//해결방법1
		//this.name = name;
		this.studentNo = studentNo;
	}
	
}