
public class ConditionalOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score = 85;
		char grade = (score>90)?'A':(score>80)?'B':'C';
		System.out.println(score+"점: "+grade+"등급입니다.");
		
		score = 94;
		grade = (score>90)?'A':(score>80)?'B':'C';
		System.out.println(score+"점: "+grade+"등급입니다.");
	}
}