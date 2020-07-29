package sec16;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTimeParsingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter formatter;
		LocalDate localDate;
		
		localDate=LocalDate.parse("2024-05-21");
		System.out.println(localDate);
		
		formatter=DateTimeFormatter.ISO_LOCAL_DATE;
		localDate=LocalDate.parse("2024-05-21", formatter);
		System.out.println(localDate);
		
		formatter=DateTimeFormatter.ofPattern("yyyy/MM/dd");
		localDate=LocalDate.parse("2024/05/21", formatter);
		System.out.println(localDate);
		
		formatter=DateTimeFormatter.ofPattern("yyyy.MM.dd");
		localDate=LocalDate.parse("2024.05.21", formatter);
		System.out.println(localDate);

	}
}