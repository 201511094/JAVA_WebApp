package sec03;

import java.util.*;

public class HashSetExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set=new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		int size=set.size();
		System.out.println("총 객체수: "+size);
		
		Iterator<String>iterator=set.iterator();	//반복자 얻기
		while(iterator.hasNext()) {
			String element=iterator.next();
			System.out.println("\t"+element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		size=set.size();
		System.out.println("총 객체수: "+size);
		
		iterator=set.iterator();	//반복자 얻기
		while(iterator.hasNext()) {
			String element=iterator.next();
			System.out.println("\t"+element);
		}
		
		System.out.println("clear()수행");
		set.clear();	//모든 객체를 제거하고 비움
		if (set.isEmpty()) {
			System.out.println("비어있음");
		}
	}
	//HashSet에 String객체를 추가,검색,삭제하는 예제
}