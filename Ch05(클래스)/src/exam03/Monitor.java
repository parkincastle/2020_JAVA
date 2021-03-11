package exam03;

public class Monitor {
	
	boolean power;
	int channel = 5;
	int volume = 10;
	
	public void power() {
		
		if(!this.power) {
			System.out.println("모니터가 켜졌습니다 ");
		}
		else {
			System.out.println("모니터가 꺼졌습니다");
		}
		this.power = !power;
	}
	
	public void channelUp() {
		
		this.channel++;
		System.out.println("현재채널은 : " + this.channel);
		
	}
	
	public void channeldown() {
		this.channel--;
		System.out.println("현재채널은 : " + this.channel);
	}
	
	public void volumeUp() {
		this.volume++;
		System.out.println("volume : " + this.volume);
	}
	
	public void volumeDown() {
		this.volume--;
		System.out.println("volume : " + this.volume);
		
	}
	
	public void showInfo() {
		
		System.out.println("현재상태 : 모니터 -  " + this.power + "채널 -  " + this.channel + "볼륨 -  " + this.volume);
		
	}
	
	@Override
	public String toString() {
		
		return this.power + "채널 -  " + this.channel 
				 + "볼륨 -  " + this.volume;
		
	}
	
}
