
public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Calculator myCalc = new Calculator();
//		myCalc.powerOn();
//		
//		int result1 = myCalc.plus(5, 6);
//		System.out.println("���� �����: " + result1);
//		
//		byte x = 10;
//		byte y = 4;
//		double result2 = myCalc.divide(x, y);
//		System.out.println("���� �����: " + result2);
//		
//		myCalc.powerOff();
		
//		Calculator myCalc=new Calculator();
//		myCalc.execute();	//execute�޼ҵ� ȣ��
		
		Calculator myCalcu=new Calculator();
		double result1=myCalcu.areaRectangle(10);
		double result2=myCalcu.areaRectangle(10, 20);
		
		System.out.println("���簢�� ����: "+result1);
		System.out.println("���簢�� ����: "+result2);
	}
}