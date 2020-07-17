package package2;
import package1.A;

public class D extends A {
	//상속관계, 접근 가능
	public D() {
		super();	//생성자 직접 호출은 불가능, super()로 호출
		this.field="value";
		this.method();
	}
	
}