
public class ShopService {

	//Singleton
	private static ShopService singleton = new ShopService();
	
	//생성자를 외부에서 호출할 수 없도록 private선언
	private ShopService() {}
	
	//외부에서 호출 가능한 정적 메소드, 자신의 객체를 리턴
	static ShopService getInstance() {
		return singleton;
	}
	
}