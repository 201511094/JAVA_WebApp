package sec05;

import java.util.function.*;

public class ConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Consumer(T t)
		Consumer<String> consumer=t->System.out.println(t+"8");
		consumer.accept("java");
		
		//BiConsumer(T t, U u)
		BiConsumer<String, String> bigConsumer=(t,u)->System.out.println(t+u);
		bigConsumer.accept("Java", "8");
		
		//DoubleConsumer(double d)
		DoubleConsumer doubleConsumer = d -> System.out.println("Java" + d);
		doubleConsumer.accept(8.0);
		
		//ObjIntConsumer(T t, int i)
		ObjIntConsumer<String> objIntConsumer = (t, i) -> System.out.println(t + i);
		objIntConsumer.accept("Java", 8);
		
	}
}