
public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 = 15;
		if (v1 > 10) {
			int v2 = v1-10;
		}
		//int v3 = v1+v2+5;	//v2가 없으므로 에러
		int v3 = v1+5;
		
		System.out.println("v3: "+v3);
	}
}