package sec04;

public class UsingThis {
	public int outterField=10;
	
	class Inner {
		int innerField=20;
		
		void method() {
			// TODO Auto-generated method stub
			//람다식
			MyFunctionalInterface fi=()-> {
				System.out.println("outterField: " + outterField);
				//바깥 객체의 참조를 얻기 위해 클래스명.this 사용
				System.out.println("outterField: " + UsingThis.this.outterField);
				System.out.println();
				
				System.out.println("innerField: " + innerField);
				//람다식 내부에서 this는 inner객체를 참조
				System.out.println("innerField: " + this.innerField);
			};
			fi.method();
			
		}
	}
	
}