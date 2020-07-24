

public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//ArrayIndexOutOfBoundsException
			String data1=args[0];	
			String data2=args[1];

			System.out.println("args[0]: "+data1);
			System.out.println("args[1]: "+data2);
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 예외 발생");
			
		} finally {
			System.out.println("프로그램 종료");
		}
	}
}

//예외 처리 대신 조건문 사용
/*
public class ArrayIndexOutOfBoundsExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length == 2) {
			String data1=args[0];
			String data2=args[1];
			
			System.out.println("args[0]: "+data1);
			System.out.println("args[1]: "+data2);
		}
		else {
			System.out.println("[실행 방법]");
			System.out.print("java ArrayIndexOutOfBoundsExceptionExample ");
			System.out.print("값1 값2");
		}
	}
}
*/