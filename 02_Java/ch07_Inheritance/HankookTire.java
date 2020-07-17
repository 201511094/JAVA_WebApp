
public class HankookTire extends Tire {

	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean roll() {
		++accumulatedRotation;

		if (accumulatedRotation < maxRotation) {
			System.out.println(location+" HankookTire 수명: "+(maxRotation-accumulatedRotation)+ "회");
			return true;	//정상회전
		}
		else {
			System.out.println("*** "+location+" HankookTire 펑크 ***");
			return false;	//펑크
		}
	}
	
}
