
public class KumhoTire extends Tire {
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;

		if (accumulatedRotation < maxRotation) {
			System.out.println(location+" KumhoTire 수명: "+(maxRotation-accumulatedRotation)+ "회");
			return true;	//정상회전
		}
		else {
			System.out.println("*** "+location+" KumhoTire 펑크 ***");
			return false;	//펑크
		}
	}
}
