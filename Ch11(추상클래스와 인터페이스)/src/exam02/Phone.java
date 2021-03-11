package exam02;

public abstract class Phone {

	private int num;
	private String company;
	private String owner;
	
	public Phone(int num, String company, String owner) {
		super();
		this.num = num;
		this.company = company;
		this.owner = owner;
	}

	public int getNum() {
		return num;
	}

	public String getCompany() {
		return company;
	}

	public String getOwner() {
		return owner;
	}
	
	public void show() {
		System.out.println("시리얼 번호 : " + this.getNum());
		System.out.println("제조회사 : " + this.getCompany());
		System.out.println("소유자 : " + this.getOwner());
	}
	
	public abstract void turnOn();
	public abstract void turnOff();
	

}
