package sec05;

import java.util.*;

public class TreeSetExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> treeSet=new TreeSet<String>();
		
		treeSet.add("apple");
		treeSet.add("forever");		
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");
		
		System.out.println("[c~f 사이의 단어 검색]");
		//"c" <= x <= "f"
		NavigableSet<String> rangeSet=treeSet.subSet("c", true, "f", true);
		for (String word: rangeSet) {
			System.out.println(word);
		}
		
	}
	//영어 단어를 무작위로 TreeSet에 저장한 후 알파벳 c~f사이의 단어를 검색해보는 예제
	//영어 단어를 정렬하고 범위 검색해보기
}