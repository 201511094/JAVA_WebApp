package sec05;

import java.util.*;

public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Fruit이 Comparable을 구현하지 않았기 때문에 예외 발생
//		TreeSet<Fruit> treeSet = new TreeSet<Fruit>();
//		treeSet.add(new Fruit("포도", 3000));
//		treeSet.add(new Fruit("수박", 10000));		
//		treeSet.add(new Fruit("딸기", 6000));
		
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator());
		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("수박", 10000));		
		treeSet.add(new Fruit("딸기", 6000));
		Iterator<Fruit> iterator = treeSet.iterator();
		while (iterator.hasNext()) {
			Fruit fruit = iterator.next();
			System.out.println(fruit.name + ":" + fruit.price);
		}
		
	}
	//내림차순 정렬자를 이용해 TreeSet에 Fruit을 저장하는 예제
	//정렬자를 주지 않으면 ClassCastExcetpion예외 발생, 정렬자를 TreeSet의 생성자에 주면 자동으로 내림차순 정렬이 됨
}