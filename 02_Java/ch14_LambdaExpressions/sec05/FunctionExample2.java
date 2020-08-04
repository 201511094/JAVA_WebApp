package sec05;

import java.util.*;
import java.util.function.*;

public class FunctionExample2 {
	
	private static List<Student> list=Arrays.asList(
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
		);
	
	public static double avg(ToIntFunction<Student> function) {
		int sum=0;
		for (Student student: list) {
			sum += function.applyAsInt(student);	//람다식 실행
		}
		double avg=(double)sum/list.size();
		
		return avg;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double englishAvg=avg(s->s.getEnglishScore());	//ToIntFunciton<Student> 인스턴스 대입
		System.out.println("영어 점수 평균: "+englishAvg);
		
		double mathAvg=avg(s->s.getMathScore());	//ToIntFunciton<Student> 인스턴스 대입
		System.out.println("수학 점수 평균: "+mathAvg);
	}
	//List에 저장된 학생 객체를 하나씩 꺼내서 영어 점수와 수학 점수의 평균값을 산출하는 예제
}