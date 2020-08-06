package sec04;

import java.util.*;

public class HashtableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map=new Hashtable<String, String>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scanner=new Scanner(System.in);
		
		while (true) {
			System.out.println("아이디와 비밀번호 입력");
			System.out.print("아이디: ");
			String id=scanner.nextLine();
			System.out.print("비밀번호: ");
			String password=scanner.nextLine();
			System.out.println();
			
			if (map.containsKey(id)) {
				if (map.get(id).equals(password)) {
					System.out.println("로그인 성공");
					break;
				}
				else System.out.println("로그인 실패 - 비밀번호가 일치하지 않음");
			}
			else System.out.println("로그인 실패 - 아이디가 일치하지 않음");
		}
	}
	//키보드로 아이디와 비밀번호를 입력받아 Hashtable에 저장되어 있는 키와 값과 비교,
	//로그인 여부를 출력하는 예제
}