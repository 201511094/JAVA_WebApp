package sec16;

import java.time.LocalDateTime;

public class DateTimeOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LocalDateTime now=LocalDateTime.now();
		 System.out.println("현재 날짜와 시간: "+now);
		 
		 //각 메소드들은 수정된 LocalDate, LocalTime, LocalDateTime, ZonedDateTime을 리턴
		 LocalDateTime targetDateTime=now
				 .plusYears(1)
				 .minusMonths(2)
				 .plusDays(3)
				 .plusHours(4)
				 .minusMinutes(5)
				 .plusSeconds(6);
		 
		 System.out.println("연산 후: "+targetDateTime);
	}
}