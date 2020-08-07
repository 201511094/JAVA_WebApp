
public class test0807_03 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		try {
			String[] array=new String[3];
			for (int i=0;i<array.length; i++) {
				System.out.println(array[i].length());
			}
		} catch (NullPointerException npe) {
			System.out.println("Here1");
			throw npe;
		} catch (Exception e) {
			System.out.println("Here2");
			throw e;
		} finally {
			System.out.println("Here3");
		}
		System.out.println("Here4");
	}
}