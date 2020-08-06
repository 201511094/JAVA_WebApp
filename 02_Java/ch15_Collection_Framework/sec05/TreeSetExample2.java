package sec05;

import java.util.*;

public class TreeSetExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> scores=new TreeSet<Integer>();
		
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));
		
		NavigableSet<Integer> descendingSet=scores.descendingSet();
		for (Integer score: descendingSet) {
			System.out.print(score+" ");
		}
		System.out.println();
		
		//descendingSet()을 두 번 호출하면 오름차순 정렬
		NavigableSet<Integer> ascendingSet=descendingSet.descendingSet();
		for (Integer score: ascendingSet) {
			System.out.print(score+" ");
		}
		
	}
	//객체 정렬하기 예제
}