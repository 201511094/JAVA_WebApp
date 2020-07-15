
public class EnumMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today=Week.SUNDAY;
		String name=today.name();	//���� ��ü�� ������ �ִ� ���ڿ��� ����
		System.out.println(name);
		
		int ordinal=today.ordinal();	//�� ��° ���� ��ü����
		System.out.println(ordinal);
		
		Week day1=Week.MONDAY;
		Week day2=Week.WEDNESDAY;
		int res1=day1.compareTo(day2);	//-2
		int res2=day2.compareTo(day1);	//2
		System.out.println(res1);
		System.out.println(res2);
		
		if (args.length==1) {
			String strDay=args[0];
			Week weekDay=Week.valueOf(strDay);	//�Ű������� �־����� ���ڿ��� ������ ���ڿ��� ������ ���� ��ü�� ����
			if (weekDay==Week.SATURDAY || weekDay==Week.SUNDAY) {
				System.out.println("�ָ�");
			}
			else {
				System.out.println("����");
			}
		}
		
		Week[] days=Week.values();	//���� Ÿ���� ��� ���� ��ü���� �迭�� ����
		for (Week day : days) {
			System.out.println(day);
		}
		
	}
}