package sec04;

import java.util.Objects;

public class ToStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "kjh";
		String str2 = null;
		
		//ù ��° �Ű����� null�̸� "null" �Ǵ� �� ��° �Ű����� nullDefault�� ����
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
		System.out.println(Objects.toString(str2, "�̸��� �����ϴ�."));
		
	}
}
