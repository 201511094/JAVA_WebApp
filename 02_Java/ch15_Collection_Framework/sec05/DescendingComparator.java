package sec05;

import java.util.Comparator;

public class DescendingComparator implements Comparator<Fruit>{

	@Override
	public int compare(Fruit o1, Fruit o2) {
		if (o1.price<o2.price) return 1;
		else if (o1.price==o2.price) return 0;
		else return -1;	
	}
	
	//가격을 기준으로 Fruit객체를 내림차순으로 정렬시키는 정렬자 예제
	//compare(T o1, T o2)
}
