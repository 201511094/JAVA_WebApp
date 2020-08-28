package com.s01.basic;

public class PrintMain {
	public static void main(String[] args) {
		//출력 후 줄바꿈
		System.out.println("Hello Java!!");
		//"syso" + ctrl + space
		System.out.println("오늘은 목요일");
		
		//출력 후 줄바꿈 없음
		System.out.print("봄");
		System.out.print("여름");
		
		//출력할 때 데이터 포맷 지정
		System.out.printf("%c%n", 'A');		//문자%c
		System.out.printf("%,d원%n", 1000);	//정수%d
		System.out.printf("%f%n", 35.896);	//실수%f(기본 6자리)
		System.out.printf("%.2f%n", 35.896);//소숫점 둘째자리까지 출력
		System.out.printf("%s%n", "봄");		//문자열
		System.out.printf("%s는 %d점입니다.", "점수",98);
	}
}