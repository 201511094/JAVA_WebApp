package sec05;

import java.util.function.Function;

public class FunctionAndThenComposeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Member, Address> functionA;
		Function<Address, String> functionB;
		Function<Member, String> functionAB;
		String city;
		
		functionA=(m)->m.getAddress();
		functionB=(a)->a.getCity();
		
		//Function<Member, String>
		functionAB=functionA.andThen(functionB);
		city=functionAB.apply(
			new Member("홍길동", "hong", new Address("한국", "서울"))
		);
		System.out.println("거주 도시: " + city);
		
		//Function<Member,String>
		functionAB = functionB.compose(functionA);
		city = functionAB.apply(
			new Member("홍길동", "hong", new Address("한국", "경기도"))
		);
		System.out.println("거주 도시: " + city);
	}
	//두 Function 함수적 인터페이스를 andThen()과 compose()를 이용해서순차적으로 연결한 예제
	//Member객체의 필드인 Address에서 city정보를 얻어내는 것이 목적
}