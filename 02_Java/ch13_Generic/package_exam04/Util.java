package package_exam04;

public class Util {
	//방법1
//	public static <K,V> V getValue(Pair<K,V> p, K k) {
//		if (p.getKey() == k) return p.getValue();
//		else return null;
//	}

	//방법2
	public static <P extends Pair<K,V> , K, V> V getValue(P p, K k) {
		if (p.getKey() == k) return p.getValue();
		else return null;
	}
	
	//getValue() 제네릭 메소드 설명
	//첫 번째 매개값: Pair타입과 하위 타입, 두 번째 매개값: 키 값
	//키 값이 일치하면 Pair에 저장된 값을 리턴, 일치하지 않으면 null을 리턴
}