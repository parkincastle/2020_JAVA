package exam06;

public class TV implements Remote{
	
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�");
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
		
		System.out.println("���� ������ " + this.volume + "�Դϴ�");
	}
	
	public void show() {
		System.out.println("���� ȸ��� �Ｚ�Դϴ�.");
		
	}
	
	
	

}
