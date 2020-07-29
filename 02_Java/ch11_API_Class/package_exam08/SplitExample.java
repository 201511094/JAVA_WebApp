package package_exam08;

import java.util.StringTokenizer;

public class SplitExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "아이디,이름,패스워드";
		
		//방법1 - split()메소드
		String[] tokens=str.split(",");
		for (String token: tokens) {
			System.out.print(token+" ");
		}
		System.out.println();
		
		//방법2 - StringTokenizer
		StringTokenizer st=new StringTokenizer(str, ",");
		while (st.hasMoreTokens()) {
			String token=st.nextToken();
			System.out.print(token+" ");
		}
		
	}
}