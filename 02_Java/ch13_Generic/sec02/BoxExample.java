package sec02;

public class BoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box=new Box();
		box.set("kjh");	//자동 타입 변환 String->Object
		String name=(String)box.get();	//Object to String
		
		box.set(new Apple());	//자동 타입 변환 Apple->Object
		Apple apple=(Apple)box.get();	//Object to Apple
	}
}