package package_exam06;

public class Child extends Parent {
	private String name;
	
	public Child() {
		this("kjh");
		System.out.println("Child() call");
	}
	public Child(String name) {
		this.name=name;
		System.out.println("child(String name) call");
	}
	
} 