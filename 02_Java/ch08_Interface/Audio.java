
public class Audio implements RemoteControl {
	private int volume;
	private boolean mute;
	
	@Override
	//turnOn() - 추상메소드의 실체 메소드
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Audio를 켭니다.");
	}

	@Override
	//turnOff() - 추상메소드의 실체 메소드
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Audio를 끕니다.");
	}

	@Override
	//setVolume() - 추상메소드의 실체 메소드
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 Audio볼륨: "+this.volume);
	}
	
	@Override
	//디폴트 메소드 재정의
	public void setMute(boolean mute) {
		this.mute=mute;
		if (mute) {
			System.out.println("Audio를 무음처리합니다.");
		}
		else {
			System.out.println("Audio를 무음해제합니다.");
		}
	}
}
