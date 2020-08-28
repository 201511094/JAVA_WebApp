package com.s02.array;

public class ArrayMain02 {
	public static void main(String[] args) {
		int sum = 0;			//총점
		float average = 0.0f;	//평균
		
		//성적
		int[] score = {100,88,88,100,90};
		
		for (int i=0; i<score.length; i++) {
			//총점구하기
			sum += score[i];	//누적
		}
		//평균구하기
		average = sum / (float)score.length;
		System.out.printf("총점 : %d%n", sum);
		System.out.printf("평균 : %.2f", average);
	}
}