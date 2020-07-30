package package_exam08;

import java.util.StringTokenizer;

public class SplitExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "���̵�,�̸�,�н�����";
		
		//���1 - split()�޼ҵ�
		String[] tokens=str.split(",");
		for (String token: tokens) {
			System.out.print(token+" ");
		}
		System.out.println();
		
		//���2 - StringTokenizer
		StringTokenizer st=new StringTokenizer(str, ",");
		while (st.hasMoreTokens()) {
			String token=st.nextToken();
			System.out.print(token+" ");
		}
		
	}
}