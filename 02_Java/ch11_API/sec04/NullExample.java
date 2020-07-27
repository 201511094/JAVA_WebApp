package sec04;

import java.util.Objects;

public class NullExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "kjh";
		String str2 = null;
		
		//ob�� not null�̸� ob, ob�� null�̸� NullPointerException
		System.out.println(Objects.requireNonNull(str1));
		
		//
		try {
			String name=Objects.requireNonNull(str2);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			String name=Objects.requireNonNull(str2, "�̸��� �����ϴ�.");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			//���ٽ�, ���ٽ��� �������̽��� ���� ��ü��
			String name=Objects.requireNonNull(str2, ()->"�̸��� ��¥ �����ϴ�.");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}