package sec05;

import java.util.function.Predicate;

public class PredicateIsEqualExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> predicate;
		
		predicate=Predicate.isEqual(null);
		System.out.println("null, null: "+predicate.test(null));
		
		predicate=Predicate.isEqual("Java8");
		System.out.println("null, Java8: "+predicate.test(null));

		predicate=Predicate.isEqual(null);
		System.out.println("Java8, null: "+predicate.test("Java8"));

		predicate=Predicate.isEqual("Java8");
		System.out.println("Java8, Java8: "+predicate.test("Java8"));

		predicate=Predicate.isEqual("Java8");
		System.out.println("Java7, Java8: "+predicate.test("Java7"));

	}
	//두 문자열을 비교하기 위해 Predicate의 isEqual() 정적 메소드를 사용한 예제
	//Objects.equals(sourceObject, targetObject)
}