package exam02;

public class FolderPhone extends Phone{

	public FolderPhone(int num, String company, String owner) {
		super(num, company, owner);
		
	}

	@Override
	public void turnOn() {
		System.out.println("폴더폰이 켜졌습니다");
	}

	@Override
	public void turnOff() {
		System.out.println("폴더폰이 꺼졌습니다");
	}

	
	
}
