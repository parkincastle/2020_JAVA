package exam06;

public class Audio implements Remote{

	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("오디오를 킵니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		
		this.volume = volume;
		
		if(volume > 10) {
			this.volume = MAX;
		}
		else if(volume < 0) {
			this.volume = MIN;
		}
		else {
			this.volume = volume;
		}
		
		System.out.println("현재 볼륨은" + this.volume + "입니다");
	}

	public void show() {
		System.out.println("제조회사는 엘지 입니다.");
	}
	
	
}
