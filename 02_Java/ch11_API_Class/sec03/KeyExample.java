package sec03;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Key객체를 식별키로 사용해서 String값을 저장하는 HashMap객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		//식별키 "new Key(1)"로 "kjh"를 저장함
		hashMap.put(new Key(1), "kjh");
		
		//식별키 "new Key(1)" 로 "kjh"를 읽어옴
		String value  = hashMap.get(new Key(1));
		System.out.println(value);
		
		Object obj = new Object();
		System.out.println(obj);
		System.out.println(obj.hashCode());
	}
}