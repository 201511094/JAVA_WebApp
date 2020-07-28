package sec03;
/*
public class Member {
	public String id;
	
	public Member(String id) {
		this.id=id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {	//�Ű��� Ÿ�� Ȯ��
			Member member = (Member) obj;	//���� Ÿ�� ��ȯ
			if (id.equals(member.id)) {	//id�ʵ尪�� �������� �˻�
				return true;
			}
		}
		
		return false;
	}
	
	//hashCode() �������̵�
	//id�� ������ ���ڿ��� ��� ���� �ؽ� �ڵ带 ����
	@Override
	public int hashCode() {
		return id.hashCode();
	}
	
}
*/

//���� ����
//Cloneable ��� - ���� ���
/*
public class Member implements Cloneable {
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	public Member(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	public Member getMember() {
		Member cloned = null;
		
		try {
			cloned = (Member) clone();
		} catch (CloneNotSupportedException e) {}
		
		return cloned;
	}
}
*/

import java.util.Arrays;
//���� ����
public class Member implements Cloneable {
	public String name;
	public int age;
	//���� Ÿ�� �ʵ�, ���� ���� ���
	public int[] scores;
	public Car car;
	
	public Member(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//�켱 Object�� clone()�� ȣ���Ͽ� ���� ���� ����
		Member cloned = (Member)super.clone();
		//clone()�޼ҵ� ������
		//scores ���� ����
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		//car ���� ����
		cloned.car = new Car(this.car.model);
		//Member��ü ����
		return cloned;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();	//�����ǵ� clone()�޼ҵ� ȣ��
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return cloned;
	}
	
}