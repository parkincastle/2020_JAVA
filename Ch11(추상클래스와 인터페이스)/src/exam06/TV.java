package exam06;

public class TV implements Remote{
	
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
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
		
		System.out.println("현재 볼륨은 " + this.volume + "입니다");
	}
	
	public void show() {
		System.out.println("제조 회사는 삼성입니다.");
		
	}
	
	
	

}
