package sec04;

import java.util.Objects;

public class ToStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "kjh";
		String str2 = null;
		
		//첫 번째 매개값이 null이면 "null" 또는 두 번째 매개값인 nullDefault를 리턴
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
		System.out.println(Objects.toString(str2, "이름이 없습니다."));
		
	}
}
