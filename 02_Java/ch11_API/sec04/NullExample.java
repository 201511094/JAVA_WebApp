package sec04;

import java.util.Objects;

public class NullExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "kjh";
		String str2 = null;
		
		//ob가 not null이면 ob, ob가 null이면 NullPointerException
		System.out.println(Objects.requireNonNull(str1));
		
		//
		try {
			String name=Objects.requireNonNull(str2);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			String name=Objects.requireNonNull(str2, "이름이 없습니다.");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			//람다식, 람다식은 인터페이스의 구현 객체임
			String name=Objects.requireNonNull(str2, ()->"이름이 진짜 없습니다.");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}