package kr.spring.ch07;

public class SystemMonitor {
	//프로퍼티
	private long periodTime;
	private SmsSender smsSender;
	
	//DI 프로퍼티 방식으로 의존 관계 설정
	public void setPeriodTime(long periodTime) {
		this.periodTime = periodTime;
	}
	public void setSmsSender(SmsSender smsSender) {
		this.smsSender = smsSender;
	}
	
	@Override
	public String toString() {
		return "SystemMonitor [periodTime=" + periodTime + ", smsSender=" + smsSender + "]";
	}
	
}