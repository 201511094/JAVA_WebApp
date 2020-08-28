package com.s01.basic;

public class PrintMain02 {
	//"main" + ctrl + space
	public static void main(String[] args) {
		/*
		 * [실습] System.out.printf를 이용해서 출력하기
		 * 국어 : 98점
		 * 영어 : 97점
		 * 총점 : 195점
		 * 평균 : 97.5점
		 */
		System.out.printf("%s : %d점%n", "국어",98);
		System.out.printf("%s : %d점%n", "영어",97);
		System.out.printf("%s : %d점%n", "총점",195);
		System.out.printf("%s : %.1f점", "평균",97.5);
	}
}