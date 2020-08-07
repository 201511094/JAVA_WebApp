
public class test0807_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="abc";
		String str2="abc";
		StringBuffer sb1=new StringBuffer(str1);
		StringBuffer sb2=new StringBuffer(str2);
		
		if (str1==str2) System.out.print("1");
		else System.out.print("2");
		
		if (str1.equals(str2)) System.out.print("3");
		else System.out.print("4");
		
		if (sb1.equals(sb2)) System.out.print("5");
		else System.out.print("6");
		
		if (sb1.toString().equals(sb2.toString())) System.out.print("7");
		else System.out.print("8");
		
	}
}