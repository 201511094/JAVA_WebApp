package package_exam06_07;

import java.util.function.ToIntFunction;

public class LambdaExample {
	private static Student[] students = {
			new Student("홍길동", 90, 96),
			new Student("신용권", 95, 93)
		};
	
	//avg() 메소드 작성
	private static double avg(ToIntFunction<Student> function) {
		// TODO Auto-generated method stub
		int sum=0;
		double avg=0.0;
		
		for (Student st: students) {
			sum += function.applyAsInt(st);
		}
		avg=(double)sum/students.length;
		
		return avg;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double englishAvg = avg(s -> s.getEnglishScore());	//람다식
		double englishAvg2=avg(Student::getEnglishScore);	//메소드 참조
		System.out.println("영어 평균 점수: " + englishAvg);
		System.out.println("영어 평균 점수: " + englishAvg2);
		
		double mathAvg = avg(s -> s.getMathScore());	//람다식
		double mathAvg2=avg(Student::getMathScore);	//메소드 참조
		System.out.println("수학 평균 점수: " + mathAvg);
		System.out.println("수학 평균 점수: " + mathAvg2);
	}
	
	public static class Student {
		private String name;
		private int englishScore;
		private int mathScore;
		
		public Student(String name, int englishScore, int mathScore) {
			this.name = name;
			this.englishScore = englishScore;
			this.mathScore = mathScore;
		}

		public String getName() {return name;}
		public int getEnglishScore() {return englishScore;}
		public int getMathScore() {return mathScore;}
	}
	
}