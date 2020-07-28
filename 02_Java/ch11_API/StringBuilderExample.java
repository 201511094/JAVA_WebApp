
public class StringBuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();	//StringBuilder객체 생성
		
		//문자열을 끝에 추가
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		//index4 위치에 2를 삽입
		sb.insert(4, "2");
		System.out.println(sb.toString());

		//index4 위치의 문자를 6으로 변경
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		
		//index6부터 index13 전까지(12까지만)를 "Book"으로 교체
		sb.replace(6, 13, "Book");
		System.out.println(sb.toString());
		
		//index4부터 index5 전까지(index4만) 삭제
		sb.delete(4, 5);
		System.out.println(sb.toString());
		
		//총 문자 수
		int length = sb.length();
		System.out.println("총 문자 수: " + length);
		
		//버퍼에 있는 것을 String타입으로 리턴
		String result = sb.toString();
		System.out.println(result);	
		
	}
}