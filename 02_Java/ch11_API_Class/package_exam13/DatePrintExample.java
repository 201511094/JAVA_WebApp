package package_exam13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePrintExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now=new Date();
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy�� MM�� dd�� E���� HH�� mm��");
		System.out.println(sdf.format(now));
		
	}
}