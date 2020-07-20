
public class DefaultMethodExtendsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildInterface1 ci1 = new ChildInterface1() {
			@Override
			public void method1() {
				// TODO Auto-generated method stub
				System.out.println("ChildInterface1-method1() 실행");
			}
			@Override
			public void method3() {
				// TODO Auto-generated method stub
				System.out.println("ChildInterface1-method3() 실행");
			}
		};
		ci1.method1();
		ci1.method2();	//ParentInterface-method2
		ci1.method3();
		System.out.println("=====");
		
		ChildInterface2 ci2 = new ChildInterface2() {
			@Override
			public void method1() {
				// TODO Auto-generated method stub
				System.out.println("ChildInterface2-method1() 실행");
			}
			@Override
			public void method3() {
				// TODO Auto-generated method stub
				System.out.println("ChildInterface2-method3() 실행");
			}
		};
		ci2.method1();
		ci2.method2();	//ChildInterface-method2
		ci2.method3();
		System.out.println("=====");
		
		
		ChildInterface3 ci3 = new ChildInterface3() {
			@Override
			public void method1() {
				// TODO Auto-generated method stub
				System.out.println("ChildInterface3-method1() 실행");
			}
			@Override
			public void method2() {
				// TODO Auto-generated method stub
				System.out.println("ChildInterface3-method2() 실행");
			}
			@Override
			public void method3() {
				// TODO Auto-generated method stub
				System.out.println("ChildInterface3-method3() 실행");
			}
		};
		ci3.method1();
		ci3.method2();	//재선언한 ChildInterface-method2
		ci3.method3();
		System.out.println();
	}
}