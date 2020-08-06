package sec04;

import java.util.*;

public class HashMapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map=new HashMap<String, Integer>();	//Map컬렉션 생성
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println("총 Entry 수: " + map.size());
		System.out.print("홍길동 찾기: ");
		System.out.println("홍길동, " + map.get("홍길동")+'\n');
		
		Set<String> keySet=map.keySet();
		Iterator<String> keyIterator=keySet.iterator();
		while (keyIterator.hasNext()) {
			String key=keyIterator.next();
			Integer value=map.get(key);
			System.out.println("\t"+key+": "+value);
		}
		System.out.println();
		
		map.remove("홍길동");
		System.out.println("총 Entry 수: " + map.size());
		
		Set<Map.Entry<String, Integer>> entrySet=map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator=entrySet.iterator();
		
		while (entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry=entryIterator.next();
			String key=entry.getKey();
			Integer value=entry.getValue();
			System.out.println("\t"+key+": "+value);
		}
		System.out.println();
		
		System.out.println("clear()수행 ");
		map.clear();	//모든 Map.Entry 삭제
		System.out.println("총 Entry 수: "+map.size());
		
	}
	//이름을 키로, 점수를 값으로 저장하는 HashMap사용 방법 예제
}