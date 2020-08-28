package com.s02.array;

public class ArrayMain {
	public static void main(String[] args) {
		char[] ch;			//배열 선언
		ch = new char[4];	//배열 생성, 고정길이
		//배열 초기화
		ch[0] = 'J';
		ch[1] = 'a';
		ch[2] = 'v';
		ch[3] = 'a';
		
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[2]);
		System.out.println(ch[3]);
		
		//반복문을 이용한 배열의 요소 출력
		for (int i=0; i<ch.length; i++) {
			System.out.println("ch["+i+"]:" + ch[i]);
		}
		System.out.println("----------");
		
		//배열 선언, 생성
		int[] it = new int[6];
		for (int i=0; i<it.length; i++) {
			System.out.println(it[i]);
		}
		System.out.println("----------");
		
		it[0] = 10;
		it[1] = 20;
		it[2] = 30;
		it[3] = 40;
		it[4] = 50;
		it[5] = 60;
		for (int i=0; i<it.length; i++) {
			System.out.println(it[i]);
		}
		
		//배열 선언, 생성(명시적 배열 생성), 초기화
		char[] ch2 = new char[] {'J', 'a', 'v', 'a'};
		
		//배열 선언, 생성(암시적 배열 생성), 초기화
		char[] ch3 = {'자', '바'};
	}
}