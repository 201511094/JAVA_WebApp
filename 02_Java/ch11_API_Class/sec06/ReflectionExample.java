package sec06;

import java.lang.reflect.*;

public class ReflectionExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Class clazz = Class.forName("sec06.Car");
		System.out.println("[Ŭ���� �̸�]");
		System.out.println(clazz.getName()+'\n');
		
		//������ �̸��� �Ű����� ���� ���
		System.out.println("[������ ����]");
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for(Constructor constructor : constructors) {
			System.out.print(constructor.getName() + "(");
			Class[] parameters = constructor.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}		
		System.out.println();
		
		//�ʵ� Ÿ�԰� �ʵ� �̸� ���
		System.out.println("[�ʵ� ����]");
		Field[] fields = clazz.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field.getType().getSimpleName() + " " + field.getName());
		}
		System.out.println();
		
		//�޼ҵ� �̸��� �Ű����� ���
		System.out.println("[�޼ҵ� ����]");
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method : methods) {
			System.out.print(method.getName() + "(");
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
	}

	//�Ű����� ������ ����ϴ� �ڵ�
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