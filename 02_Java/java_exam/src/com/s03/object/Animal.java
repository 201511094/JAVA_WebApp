package com.s03.object;

public class Animal {
	private String name;	//이름(동물 종류)
	private int age;		//나이
	private boolean fly;	//비행여부
	
	public Animal() {}
	public Animal(String name, int age, boolean fly) {
		this.name = name;
		this.age = age;
		this.fly = fly;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isFly() {
		return fly;
	}
	public void setFly(boolean fly) {
		this.fly = fly;
	}
	
	public void print() {
		System.out.println("이름 : "+this.getName());
		System.out.println("나이 : "+this.getAge());
		//System.out.println("비행여부 : "+ this.isFly());
		
		//방법1
//		if (this.isFly() == true) {System.out.println("비행여부 : 가능");}
//		else {System.out.println("비행여부 : 불가능");}
		//방법2
		System.out.println("비행여부 : "+ (this.isFly() ? "가능" : "불가능"));
	}
}