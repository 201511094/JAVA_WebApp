package sec14;

import java.util.TimeZone;

public class PrintTimeZoneID {
	public static void main(String[] args) {
		//��� ������ �ð��� ���ڿ�
		String[] availableIDs = TimeZone.getAvailableIDs();
		for(String id: availableIDs) {
			System.out.println(id);
		}
		
	}
}