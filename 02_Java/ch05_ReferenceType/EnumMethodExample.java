
public class EnumMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today=Week.SUNDAY;
		String name=today.name();	//열거 객체가 가지고 있는 문자열을 리턴
		System.out.println(name);
		
		int ordinal=today.ordinal();	//몇 번째 열거 객체인지
		System.out.println(ordinal);
		
		Week day1=Week.MONDAY;
		Week day2=Week.WEDNESDAY;
		int res1=day1.compareTo(day2);	//-2
		int res2=day2.compareTo(day1);	//2
		System.out.println(res1);
		System.out.println(res2);
		
		if (args.length==1) {
			String strDay=args[0];
			Week weekDay=Week.valueOf(strDay);	//매개값으로 주어지는 문자열과 동일한 문자열을 가지는 열거 객체를 리턴
			if (weekDay==Week.SATURDAY || weekDay==Week.SUNDAY) {
				System.out.println("주말");
			}
			else {
				System.out.println("평일");
			}
		}
		
		Week[] days=Week.values();	//열거 타입의 모든 열거 객체들을 배열로 리턴
		for (Week day : days) {
			System.out.println(day);
		}
		
	}
}