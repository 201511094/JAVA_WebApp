
public class GarbageValueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte var1 = 125;		//127�� �ٴٸ��� -128���� �ٽ� ����
		int var2 = 125;
		for (int i=0; i<5; i++) {
			var1++;
			var2++;
			System.out.println("var1: "+var1+'\t'+"var2: "+var2);
		}
		
		byte bv=-125;		//-128�� �ٴٸ��� 127���� �ٽ� ����
		for (int i=0;i<5;i++){
			bv--;
			System.out.println("bv: "+bv);
		}
	}
}