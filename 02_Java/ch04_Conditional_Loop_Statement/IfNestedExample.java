
public class IfNestedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String grade;
		int score = (int)(Math.random()*20) + 81;	//0+81 ~ 19+81
		
		System.out.println("점수: " + score);
		
		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			}
			else {
				grade = "A";
			}
		}
		else {	
			if (score >= 85) {
				grade = "B+";
			}
			else {
				grade = "B";
			}
		}
		
		System.out.println("학점: " + grade);
	}
}