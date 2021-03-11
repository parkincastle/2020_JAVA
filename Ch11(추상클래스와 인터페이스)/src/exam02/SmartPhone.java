package exam02;

public class SmartPhone extends Phone{

	public SmartPhone(int num, String company, String owner) {
		super(num, company, owner);
		
	}

	@Override
	public void turnOn() {
		System.out.println("스마트폰이 켜졌습니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("스마트폰이 껴졌습니다");
	}

	

}
