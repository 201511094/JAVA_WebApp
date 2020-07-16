package package2;
import package1.A;	//import

public class C {
//	A a1=new A(true);
	//A a2=new A(1);	//default 접근불가
	//A a3=new A("문자열");	//private 접근불가
	
	public C() {
		A a = new A();
		a.field1=1;
		//a.field2=1;	//default 접근불가
		//a.field3=1;	//private 접근불가
		
		a.method1();
		//a.method2();	//default 접근불가
		//a.method3();	//private 접근불가
	}
}