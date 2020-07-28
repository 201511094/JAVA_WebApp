package sec06;

import java.lang.reflect.*;

public class ReflectionExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class clazz = Class.forName("sec06.Car");
		System.out.println("[클래스 이름]");
		System.out.println(clazz.getName()+'\n');
		
		//생성자 이름과 매개변수 정보 출력
		System.out.println("[생성자 정보]");
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for(Constructor constructor : constructors) {
			System.out.print(constructor.getName() + "(");
			Class[] parameters = constructor.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}		
		System.out.println();
		
		//필드 타입과 필드 이름 출력
		System.out.println("[필드 정보]");
		Field[] fields = clazz.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field.getType().getSimpleName() + " " + field.getName());
		}
		System.out.println();
		
		//메소드 이름과 매개변수 출력
		System.out.println("[메소드 정보]");
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method : methods) {
			System.out.print(method.getName() + "(");
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
	}

	//매개변수 정보를 출력하는 코드
	private static void printParameters(Class[] parameters) {
		// TODO Auto-generated method stub
		for (int i=0;i<parameters.length; i++) {
			System.out.println(parameters[i].getName());
			if (i < (parameters.length-1)) {
				System.out.print(",");
			}
		}
	}
	
}