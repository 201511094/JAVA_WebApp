package sec05;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2의 배수와 3의 배수 검사
		IntPredicate predicateA=a->a%2==0;
		IntPredicate predicateB=(a)->a%3==0;
		
		IntPredicate predicateAB;
		boolean result;
		
		//and()
		predicateAB=predicateA.and(predicateB);
		result=predicateAB.test(9);
		System.out.println("9는 2와 3의 배수? "+result);
		
		//or()
		predicateAB=predicateA.or(predicateB);
		result=predicateAB.test(9);
		System.out.println("9는 2 또는 3의 배수? "+result);
		
		//negate()
		predicateAB=predicateA.negate();
		result=predicateAB.test(9);
		System.out.println("9는 홀수? "+result);
		
	}
	//두 Predicate를 논리 연산한 새로운 Predicate를 생성하는 예제
	//Predicate는 2의 배수와 3의 배수를 조사
}