package sec15;

import java.text.MessageFormat;

public class MessageFormatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id="java";
		String name="kjh";
		String tel="010-123-1234";
		String text="회원 ID: {0}\n회원 이름: {1}\n회원 전화번호: {2}";
		String result1=MessageFormat.format(text, id, name, tel);	//인덱스 순서에 맞게 값 나열
		System.out.println(result1+'\n');
		
		String sql="insert into member values({0}, {1}, {2})";
		Object[] arguments= {"'java'", "'kjh'", "'010-123-1234'"};	//매개값 대입용
		String result2=MessageFormat.format(sql, arguments);
		System.out.println(result2);
		
	}
}