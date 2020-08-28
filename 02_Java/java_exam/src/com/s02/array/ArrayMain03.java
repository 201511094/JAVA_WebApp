package com.s02.array;

public class ArrayMain03 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 1) 10,20,30,40,50을 초기값으로 갖는 1차원 배열을 test이름으로 선언,생성,초기화
		 * 2) 반복문을 이용해서 배열의 요소 출력
		 * 3) 인덱스 3의 데이터를 100으로 변경
		 * 4) 마지막 요소의 값을 200으로 변경
		 * 5) 반복문을 사용해서 모든 요소의 값을 0으로 초기화
		 * 6) 홀수 인덱스의 요소는 10, 짝수 인덱스의 요소는 20으로 저장
		 */
		int[] test = new int[] {10,20,30,40,50};	//1번
		//2번
		//일반 for문, i값은 인덱스(= 0,1,2,3,4)
		for (int i=0; i<test.length; i++) {
			System.out.println(test[i]);
		}
		System.out.println("----------");
		//확장 for문, i는 배열의 요소(= 10,20,30,40,50)
		for (int num: test) {
			System.out.println(num);
		}
		System.out.println("----------");
		
		test[3] = 100;				//3번
		test[test.length-1] = 200;	//4번
		for (int i=0; i<test.length; i++) {
			System.out.println("test["+i+"] : " + test[i]);
		}
		System.out.println("----------");
		
		for (int i=0; i<test.length; i++) {
			test[i] = 0;	//5번
		}
		for (int i=0; i<test.length; i++) {
			System.out.println("test["+i+"] : " + test[i]);
		}
		System.out.println("----------");
		
		for (int i=0; i<test.length; i++) {
			if (i % 2 == 1) test[i] = 10;	//홀수 인덱스
			else test[i] = 20;				//짝수 인덱스
		}
		for (int i=0; i<test.length; i++) {
			System.out.println("test["+i+"] : " + test[i]);
		}
		System.out.println("----------");
	}
}