
public class Computer extends Calculator {
	
	@Override
	double areaCircle(double r) {
		return super.areaCircle(r);	//부모꺼 실행하기
		
		//System.out.println("Computer객체의 areaCircle() 실행");
		//return Math.PI*r*r;
	}
}