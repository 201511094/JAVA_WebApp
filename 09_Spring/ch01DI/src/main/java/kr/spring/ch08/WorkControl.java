package kr.spring.ch08;

public class WorkControl {
	//프로퍼티
	private long periodTime;
	private EmailSender email;
	
	//DI 프로퍼티 설정 방식
	//의존 객체 주입 - periodTime, email
	public void setPeriodTime(long periodTime) {
		this.periodTime = periodTime;
	}
	public void setEmail(EmailSender email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "WorkControl [periodTime=" + periodTime + ", email=" + email + "]";
	}
	
}