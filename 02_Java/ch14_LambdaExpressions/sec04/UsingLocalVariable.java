package sec04;

public class UsingLocalVariable {
	void method(int arg) {	//final특성을 가짐
		int localVar=40;	//final특성을 가짐
		
		//final특성 때문에 수정 불가
		//arg=31;
		//localVar=41;
		
		//람다식
		MyFunctionalInterface fi= () -> {
			//로컬변수 사용
			System.out.println("arg: " + arg); 
			System.out.println("localVar: " + localVar + "\n");
		};
		
		fi.method();
	}
}