package exam03;

public class Monitor {
	
	boolean power;
	int channel = 5;
	int volume = 10;
	
	public void power() {
		
		if(!this.power) {
			System.out.println("����Ͱ� �������ϴ� ");
		}
		else {
			System.out.println("����Ͱ� �������ϴ�");
		}
		this.power = !power;
	}
	
	public void channelUp() {
		
		this.channel++;
		System.out.println("����ä���� : " + this.channel);
		
	}
	
	public void channeldown() {
		this.channel--;
		System.out.println("����ä���� : " + this.channel);
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
		
		System.out.println("������� : ����� -  " + this.power + "ä�� -  " + this.channel + "���� -  " + this.volume);
		
	}
	
	@Override
	public String toString() {
		
		return this.power + "ä�� -  " + this.channel 
				 + "���� -  " + this.volume;
		
	}
	
}
