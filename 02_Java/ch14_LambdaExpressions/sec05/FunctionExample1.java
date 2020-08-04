package sec05;

import java.util.*;
import java.util.function.*;

public class FunctionExample1 {

	private static List<Student> list=Arrays.asList(
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
		);
	public static void printString(Function<Student, String> function) {
		for (Student student: list) {	//list에 저장된 항목 수만큼 반복
			System.out.print(function.apply(student)+" ");	//람다식 실행
		}
		System.out.println();
	}
	public static void printInt(ToIntFunction<Student> function) {
		for (Student student: list) {	//list에 저장된 항목 수만큼 반복
			System.out.print(function.applyAsInt(student)+" ");	//람다식 실행
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("[학생 이름]");
		printString( t -> t.getName() );
		
		System.out.println("[영어 점수]");
		printInt( t -> t.getEnglishScore() );
		
		System.out.println("[수학 점수]");
		printInt( t -> t.getMathScore() );
		
	}
	//List에 저장된 학생 객체를 하나씩 꺼내서 이름과 점수를 출력하는 예제
}