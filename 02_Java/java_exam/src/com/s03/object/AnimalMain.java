package com.s03.object;

public class AnimalMain {
	
	//boolean타입의 fly를 "가능", "불가능"으로 출력하는 방법?
	//방법1: if문, 방법2: 삼항연산자, 방법3: static method 사용
	public static String printFly(boolean fly) {
		return fly ? "가능" : "불가능";
	}
	
	public static void main(String[] args) {
		/*
		 * 객체를 생성하고 setXXX메소드를 이용해서 데이터를 저장 -> 기러기,3,true
		 * 출력예시
		 * 이름: 기러기
		 * 나이: 3
		 * 비행여부: true
		 */
		Animal a1 = new Animal();
		a1.setName("기러기");
		a1.setAge(3);
		a1.setFly(true);
		a1.print();	//출력
		System.out.println("----------");
		
		/*
		 * 생성자를 통해서 데이터를 전달함 -> 기린,12,false
		 * 출력예시
		 * 이름: 기린
		 * 나이: 12
		 * 비행여부: false
		 */
		Animal a2 = new Animal("기린", 12, false);
		System.out.println("이름 : "+ a2.getName());
		System.out.println("나이 : "+ a2.getAge());
		System.out.println("비행여부 : "+ printFly(a2.isFly()));
	}
}