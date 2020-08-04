package sec05;

import java.util.function.BinaryOperator;

public class OperatorMinByMaxByExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryOperator<Fruit> binaryOperator;
		Fruit fruit;
		
		binaryOperator=BinaryOperator.minBy((f1,f2)->Integer.compare(f1.price, f2.price));
		fruit=binaryOperator.apply(new Fruit("딸기", 6000), new Fruit("수박", 10000));
		System.out.println("min: "+fruit.name+", "+fruit.price);
		
		binaryOperator=BinaryOperator.maxBy((f1,f2)->Integer.compare(f1.price, f2.price));
		fruit=binaryOperator.apply(new Fruit("딸기", 6000), new Fruit("수박", 10000));
		System.out.println("max: "+fruit.name+", "+fruit.price);
	}
	//두 과일 값을 비교해서 값이 낮거나 높은 과일을 얻어내는 예제
}