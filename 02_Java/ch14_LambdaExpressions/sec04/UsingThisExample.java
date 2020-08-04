package sec04;

public class UsingThisExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsingThis usingThis=new UsingThis();
		UsingThis.Inner inner=usingThis.new Inner();
		inner.method();
	}
}