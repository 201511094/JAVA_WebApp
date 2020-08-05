package package_exam05;

import java.util.function.IntBinaryOperator;

public class LambdaExample {
	private static int[] scores = {10, 50, 3};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//최대값 얻기
		int max=maxOrMin(
			(a,b)-> {
				if (a>=b) return a;
				else return b;
				}
			);
		System.out.println("최대값: "+max);
		
		//방법2
		int max2=maxOrMin((a,b)->(a>=b)?a:b);
		System.out.println("최대값: "+max2);
		
		//방법1
		int min=maxOrMin(
			(a,b)-> {
					if (a<b) return a;
					else return b;
				}
			);
		System.out.println("최소값: "+min);
		
		//방법2
		int min2=maxOrMin((a,b)->(a<=b)?a:b);
		System.out.println("최소값: "+min2);
	}
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}
	
	//maxOrMin() 매개값을 람다식으로 기술하는 문제
}