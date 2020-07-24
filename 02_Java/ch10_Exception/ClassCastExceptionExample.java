
public class ClassCastExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);	//"Cat cannot be cast to Dog"
	}
	
	public static void changeDog(Animal animal) {
		try {
			Dog dog = (Dog) animal;		//ClassCastException
			
		} catch(ClassCastException e) {
			System.out.println("ClassCastException 예외 발생");
			
		}
		
		//예외 처리 대신 객체 타입 체크
//		if (animal instanceof Dog) {
//			Dog dog = (Dog) animal;
//		}
		
	}
}

class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}