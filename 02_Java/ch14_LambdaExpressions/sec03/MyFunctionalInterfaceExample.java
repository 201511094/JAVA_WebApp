package sec03;

public class MyFunctionalInterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunctionalInterface fi;

		//1. 매개변수 없는 람다식
//		fi=()-> {
//			String str="method call1";
//			System.out.println(str);
//		};
//		fi.method();
//		
//		fi=()->{System.out.println("method call2");};
//		fi.method();
//		
//		fi=()->System.out.println("method call3");
//		fi.method();
		
		//2. 매개변수 있는 람다식
//		fi=(x)-> {
//			int result=x*5;
//			System.out.println(result);
//		};
//		fi.method(2);
//		
//		fi=(x)->{System.out.println(x*5);};
//		fi.method(2);
//		
//		fi=x->System.out.println(x*5);	//매개변수가 1개면 괄호 생략 가능
//		fi.method(2);
	
		//3. 리턴값이 있는 람다식
		fi=(x,y)->{
			int result=x+y;
			return result;
		};
		System.out.println(fi.method(2,5));
		
		fi=(x,y)->{return x+y;};
		System.out.println(fi.method(2, 5));
		
		fi=(x,y)->x+y;
		System.out.println(fi.method(2, 5));
		
		fi=(x,y)->sum(x,y);	//return sum(x,y)
		System.out.println(fi.method(2, 5));
		
	}
	
	public static int sum(int x, int y) {
		return (x+y);
	}
	
}