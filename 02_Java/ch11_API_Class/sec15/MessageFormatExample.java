package sec15;

import java.text.MessageFormat;

public class MessageFormatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id="java";
		String name="kjh";
		String tel="010-123-1234";
		String text="ȸ�� ID: {0}\nȸ�� �̸�: {1}\nȸ�� ��ȭ��ȣ: {2}";
		String result1=MessageFormat.format(text, id, name, tel);	//�ε��� ������ �°� �� ����
		System.out.println(result1+'\n');
		
		String sql="insert into member values({0}, {1}, {2})";
		Object[] arguments= {"'java'", "'kjh'", "'010-123-1234'"};	//�Ű��� ���Կ�
		String result2=MessageFormat.format(sql, arguments);
		System.out.println(result2);
		
	}
}