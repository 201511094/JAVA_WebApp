package sec03;

@FunctionalInterface
public interface MyFunctionalInterface {
	//public void method();				//1
	//public void method(int x);		//2
	public int method(int x, int y);	//3
	
}