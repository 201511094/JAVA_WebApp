package kr.spring.ch14;

public class SystemMonitor {
	//프로퍼티
	private PhoneCall call;

	//빈 객체를 주입받는 메소드
	public void setCall(PhoneCall call) {
		this.call = call;
	}
	
	@Override
	public String toString() {
		return "PhoneCall [call=" + call + "]";
	}
	
}