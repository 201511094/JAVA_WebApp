package sec07;

public class StringToLowerUpperCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		System.out.println("equals() 결과: "+str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println("toLowerCase()수행 후 equals() 결과: "+lowerStr1.equals(lowerStr2));
		
		System.out.println("equalsIgnoreCase() 결과: "+str1.equalsIgnoreCase(str2));
	}
}