package sec14;

import java.util.TimeZone;

public class PrintTimeZoneID {
	public static void main(String[] args) {
		//사용 가능한 시간대 문자열
		String[] availableIDs = TimeZone.getAvailableIDs();
		for(String id: availableIDs) {
			System.out.println(id);
		}
		
	}
}