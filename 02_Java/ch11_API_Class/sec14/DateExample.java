package sec14;

import java.text.SimpleDateFormat;
import java.util.*;

public class DateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date now=new Date();
		String strNow1=now.toString();
		System.out.println(strNow1);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		String strNow2=sdf.format(now);
		System.out.println(strNow2);
		
	}
}