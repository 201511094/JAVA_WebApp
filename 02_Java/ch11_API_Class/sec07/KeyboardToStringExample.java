package sec07;

import java.io.IOException;

public class KeyboardToStringExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		byte[] bytes = new byte[100];	//���� ����Ʈ�� �����ϱ� ���� �迭
		
		System.out.println("�Է�: ");
		int readByteNo = System.in.read(bytes);	//�迭�� ���� ����Ʈ�� ����, ���� ����Ʈ���� ����
		String str = new String(bytes, 0, readByteNo-2);	//�迭�� ���ڿ��� ��ȯ

		System.out.println(str);
	}
}