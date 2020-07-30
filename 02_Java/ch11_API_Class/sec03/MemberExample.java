package sec03;
/*
public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�� �� MemberŸ��
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if (obj1.equals(obj2)) {
			System.out.println("obj1�� obj2�� �����մϴ�.");
		}
		else {
			System.out.println("obj1�� obj2�� �������� �ʽ��ϴ�.");
		}
		
		if (obj1.equals(obj3)) {
			System.out.println("obj1�� obj3�� �����մϴ�.");
		}
		else {
			System.out.println("obj1�� obj3�� �������� �ʽ��ϴ�.");
		}
	}
}
*/

//���� ����
/*
public class MemberExample {
	public static void main(String[] args) {
		//���� ��ü ����
		Member original = new Member("blue", "ȫ�浿", "12345", 25, true);
		
		//���� ��ü���� �н����� ����
		Member cloned = original.getMember();
		cloned.password = "67890";
		
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("id: " + cloned.id);
		System.out.println("name: " + cloned.name);
		System.out.println("password: " + cloned.password);
		System.out.println("age: " + cloned.age);
		System.out.println("adult: " + cloned.adult+'\n');
		
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("id: " + original.id);
		System.out.println("name: " + original.name);
		System.out.println("password: " + original.password);	//�������� ���� ����
		System.out.println("age: " + original.age);
		System.out.println("adult: " + original.adult);
	}
}
*/

//���� ����
public class MemberExample {
	public static void main(String[] args) {
		//���� ��ü ����
		Member original = new Member("ȫ�浿", 25, new int[] {90, 90}, new Car("�ҳ�Ÿ"));
		
		//���� ���� �� ���� ��ü�� ������ ����
		Member cloned = original.getMember();
		cloned.scores[0] = 100;
		cloned.car.model = "�׷���";
		
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("name: " + cloned.name);
		System.out.println("age: " + cloned.age);
		System.out.print("scores: {");
		for(int i=0; i<cloned.scores.length; i++) {
			System.out.print(cloned.scores[i]);
			System.out.print((i==(cloned.scores.length-1))?"":",");
		}
		System.out.println("}");
		System.out.println("car: " + cloned.car.model+'\n');
		
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("name: " + original.name);
		System.out.println("age: " + original.age);
		System.out.print("scores: {");
		for(int i=0; i<original.scores.length; i++) {
			System.out.print(original.scores[i]);
			System.out.print((i==(original.scores.length-1))?"":",");
		}
		System.out.println("}");
		System.out.println("car: " + original.car.model);
	}
}