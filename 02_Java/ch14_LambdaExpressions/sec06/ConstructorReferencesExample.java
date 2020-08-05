package sec06;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String, Member> function1=Member::new;	//생성자 참조
		Member member1=function1.apply("angel1");	//매개값 1개
		BiFunction<String, String, Member> function2=Member::new;	//생성자 참조
		Member member2=function2.apply("신천사", "angel");	//매개값 2개
	}
	//생성자 오버로딩 및 생성자 참조
}