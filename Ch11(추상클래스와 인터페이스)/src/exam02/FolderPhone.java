package exam02;

public class FolderPhone extends Phone{

	public FolderPhone(int num, String company, String owner) {
		super(num, company, owner);
		
	}

	@Override
	public void turnOn() {
		System.out.println("�������� �������ϴ�");
	}

	@Override
	public void turnOff() {
		System.out.println("�������� �������ϴ�");
	}

	
	
}
