package exam02;

public class SmartPhone extends Phone{

	public SmartPhone(int num, String company, String owner) {
		super(num, company, owner);
		
	}

	@Override
	public void turnOn() {
		System.out.println("����Ʈ���� �������ϴ�");
		
	}

	@Override
	public void turnOff() {
		System.out.println("����Ʈ���� �������ϴ�");
	}

	

}
