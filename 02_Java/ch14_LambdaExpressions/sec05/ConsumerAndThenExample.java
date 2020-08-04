package sec05;

import java.util.function.Consumer;

public class ConsumerAndThenExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<Member> consumerA=(m)-> {
			System.out.println("consumerA: "+m.getName());
		};
		
		Consumer<Member> consumerB=(m)-> {
			System.out.println("consumerB: "+m.getId());
		};
		
		//인터페이스A부터 처리하고 결과를 인터페이스B의 매개값으로 제공
		Consumer<Member> consumerAB=consumerA.andThen(consumerB);
		consumerAB.accept(new Member("홍길동", "hong", null));
		
	}
	//함수적 인터페이스 두 개를 순차적으로 연결해서 실행하는 예제
	//첫 번째는 이름을 출력, 두 번째는 아이디를 출력
}