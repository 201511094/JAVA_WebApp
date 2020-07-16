
public class Exercise04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dice1, dice2;
		
		while(true) {
			dice1=(int)(Math.random()*6)+1;
			dice2=(int)(Math.random()*6)+1;
			
			System.out.println("("+dice1+", "+dice2+")");
			
			//두 눈의 합이 5가 되면 멈춤
			if (dice1+dice2 == 5) {
				break;
			}
		}
	}
}