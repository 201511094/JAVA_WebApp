package sec06;

public class ClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		Class clazz1 = car.getClass();
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName()+'\n');

		try {
			Class clazz2 = Class.forName("sec06.Car");
			System.out.println(clazz1.getName());
			System.out.println(clazz1.getSimpleName());
			System.out.println(clazz1.getPackage().getName()+'\n');

		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}