
public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Calculator myCalc = new Calculator();
//		myCalc.powerOn();
//		
//		int result1 = myCalc.plus(5, 6);
//		System.out.println("합한 결과값: " + result1);
//		
//		byte x = 10;
//		byte y = 4;
//		double result2 = myCalc.divide(x, y);
//		System.out.println("나눈 결과값: " + result2);
//		
//		myCalc.powerOff();
		
//		Calculator myCalc=new Calculator();
//		myCalc.execute();	//execute메소드 호출
		
//		Calculator myCalcu=new Calculator();
//		double result1=myCalcu.areaRectangle(10);
//		double result2=myCalcu.areaRectangle(10, 20);
//		
//		System.out.println("정사각형 넓이: "+result1);
//		System.out.println("직사각형 넓이: "+result2);
		
		
		double result1=10*10*Calculator.pi;	//바로 사용 가능
		int result2=Calculator.plus(10, 5);
		int result3=Calculator.minus(10, 5);
		//int result4=Calculator.mul(10, 5);	//static이 아니므로 이렇게 사용 불가

		
		System.out.println("result1: "+result1);
		System.out.println("result2: "+result2);
		System.out.println("result3: "+result3);
		//System.out.println("result4: "+result4);
		
		//System.out.println(Calculator.width+1);
		//System.out.println(Calculator.height+1);
		
		
		//객체로도 접근이 가능, static이므로 객체를 만들지 않아도 접근 가능
		Calculator c = new Calculator();
		result2=c.plus(1,2);
		result3=c.minus(3,2);
		int result4=c.mul(10, 5);
		
		System.out.println("result2: "+result2);
		System.out.println("result3: "+result3);
		System.out.println("result4: "+result4);
		System.out.println(c.width+1);	//인스턴스 멤버들은 객체 생성 후 접근 가능
		System.out.println(c.height+1);
	}
}