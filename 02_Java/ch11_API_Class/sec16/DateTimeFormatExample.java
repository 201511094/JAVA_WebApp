package sec16;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime now=LocalDateTime.now();
		DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy�� M�� d�� a h�� m��");
		String nowString=now.format(dateTimeFormatter);
		System.out.println(nowString);
		
	}
}