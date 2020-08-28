package com.s01.basic;

import java.util.Scanner;

public class OperationMain03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int first=0, second=0, result=0;
		String operator;
		
		System.out.print("첫번째 수 : ");
		first = input.nextInt();
		System.out.print("연산자 : ");
		operator = input.next();
		System.out.print("두번째 수 : ");
		second = input.nextInt();
		
		switch(operator) {
		case "+":
			result = first + second;
			break;
		case "-":
			result = first - second;
			break;
		case "*":
			result = first * second;
			break;
		case "/":
			if (second != 0) {
				result = first / second;
			} else {
				System.out.println("0으로 나눌 수 없습니다.");
				System.exit(0);	//프로그램 종료
			}
			break;
		case "%":
			if (second != 0) {
				result = first % second;
			} else {
				System.out.println("0으로 나눌 수 없습니다.");
				System.exit(0);	//프로그램 종료
			}
			break;
		default :
			System.out.println("잘못된 연산자 입력");
			System.exit(0);	//프로그램 종료
		}
		System.out.println();
		System.out.printf("%d %s %d = %d", first, operator, second, result);
		
		input.close();
	}
}