
public class test0803_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
		int count = 0;
		
		if (flag ||(count++ > 0)) {
			System.out.println("count1: "+count);
		}
		if (flag && (count++ > 0)) {
			System.out.println("count2: "+count);
		}
		
		System.out.println("count3: "+count);
	}
}