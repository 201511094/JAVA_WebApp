package sec16;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTimeCreateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��¥ ���
		LocalDate currDate = LocalDate.now();
		LocalDate targetDate = LocalDate.of(2024, 5, 10);
		System.out.println("���� ��¥: " + currDate);
		System.out.println("��ǥ ��¥: " + targetDate + "\n");
		
		//�ð� ���
		LocalTime currTime=LocalTime.now();
		LocalTime targetTime=LocalTime.of(6, 30, 0, 0);
		System.out.println("���� �ð�: " + currTime);
		System.out.println("��ǥ �ð�: " + targetTime + "\n");
		
		//��¥�� �ð� ���
		LocalDateTime currDateTime=LocalDateTime.now();
		LocalDateTime targetDateTime=LocalDateTime.of(2024,5,10,6,30,0,0);
		System.out.println("���� ��¥�� �ð�: " + currDateTime);
		System.out.println("��ǥ ��¥�� �ð�: " + targetDateTime + "\n");
		
		//���� ����ÿ� �ð���
		ZonedDateTime utcDateTime=ZonedDateTime.now(ZoneId.of("UTC"));
		ZonedDateTime newyorkDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("���� �����: " + utcDateTime);
		System.out.println("���� �ð���: " + newyorkDateTime + "\n");
		
		//Ư�� ������ Ÿ�ӽ����� ���
		Instant instant1 = Instant.now();
		//Thread.sleep(10);
		Instant instant2 = Instant.now();
		
		if (instant1.isBefore(instant2)) { 
			System.out.println("instant1�� �����ϴ�.");
		} else if(instant1.isAfter(instant2)) {
			System.out.println("instant1�� �ʽ��ϴ�.");
		} else {
			System.out.println("������ �ð��Դϴ�.");
		}
		System.out.println("����(nanos): " + instant1.until(instant2, ChronoUnit.NANOS));
		
	}
}