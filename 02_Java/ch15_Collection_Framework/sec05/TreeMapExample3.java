package sec05;

import java.util.*;

public class TreeMapExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,Integer> treeMap = new TreeMap<String,Integer>();
		
		treeMap.put("apple", new Integer(10));
		treeMap.put("forever", new Integer(60));		
		treeMap.put("description", new Integer(40));
		treeMap.put("ever", new Integer(50));
		treeMap.put("zoo", new Integer(10));
		treeMap.put("base", new Integer(20));
		treeMap.put("guess", new Integer(70));
		treeMap.put("cherry", new Integer(30));
		
		System.out.println("[c ~ f 사이의 단어 검색]");
		NavigableMap<String,Integer> rangeMap = treeMap.subMap("c", true, "f", true);
		for (Map.Entry<String, Integer> entry: rangeMap.entrySet()) {
			System.out.println(entry.getKey() + "-" + entry.getValue() + "페이지");
		}
	}
	//영어 단어와 페이지 정보를 무작위로 TreeMap에 저장한 후 알파벳 c~f 사이의 단어를 검색해보는 예제
	//키로 정렬하고 범위 검색하기
}