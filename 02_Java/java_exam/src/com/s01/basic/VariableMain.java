package com.s01.basic;

public class VariableMain {
	public static void main(String[] args) {
		//변수는 값을 저장할 수 있는 메모리 공간
		//변수 선언
		int num;

		//변수 초기화
		num = 17;
		
		//출력
		System.out.println(num);
		
		//변수 선언, 초기화, 출력
		int number = 20;
		System.out.println(number);
	
		//데이터 변경
		number = 40;
		System.out.println(number);
		
		//주의사항
		//동일한 변수명으로 선언하면 오류
		//int number = 100;
		
		int a=10, b=20;
		int result = a+b;	//연산
		System.out.printf("result = %d%n", result);
		
		//주의사항
		System.out.println("결과 : "+ a + b);	//+ 연결
		System.out.println("결과 : " + (a+b));//+ 연산
		
		//변수 선언
		int no;
		//변수 선언 후 출력 또는 연산하기 전에 반드시 초기화를 해야 함
		//System.out.println(no);
	}
}