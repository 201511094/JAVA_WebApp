import java.lang.reflect.*;

public class PrintAnnotationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Service클래스로부터 메소드 정보를 얻음
		Method[] declaredMethods = Service.class.getDeclaredMethods();	//리플렉션
		
		for (Method method: declaredMethods) {
			System.out.println(method);	//불러오는 method가 달라짐
		}
		System.out.println("=====");
		
		//Method객체 하나씩 처리
		for (Method method: declaredMethods) {
			//PrintAnnotation이 적용되었는지 확인
			if (method.isAnnotationPresent(PrintAnnotation.class)) {
				//PrintAnnotation객체 얻기
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				
				System.out.println(printAnnotation);
				
				//메소드 이름
				System.out.println("["+method.getName()+"]");
				//구분선
				for (int i=0; i<printAnnotation.number(); i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println("");
				
				try {
					//메소드 호출
					method.invoke(new Service());
				} catch(Exception e) {
					System.out.println();
				}
			}
		}
	}
}