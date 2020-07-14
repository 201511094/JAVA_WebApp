
public class GarbageValueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte var1 = 125;		//127에 다다르면 -128부터 다시 저장
		int var2 = 125;
		for (int i=0; i<5; i++) {
			var1++;
			var2++;
			System.out.println("var1: "+var1+'\t'+"var2: "+var2);
		}
		
		byte bv=-125;		//-128에 다다르면 127부터 다시 저장
		for (int i=0;i<5;i++){
			bv--;
			System.out.println("bv: "+bv);
		}
	}
}