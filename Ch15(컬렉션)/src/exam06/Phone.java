package exam06;

public class Phone {

	private String name;
	private String add;
	private String hp;
	
	public Phone(String name, String add, String hp) {
		super();
		this.name = name;
		this.add = add;
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public String getAdd() {
		return add;
	}

	public String getHp() {
		return hp;
	}
	
	@Override
	public String toString() {
		return "�̸� : " + getName() + "\n�ּ� : " + getAdd() + "\n��ȭ��ȣ : " + getHp();
	}
	
	
	
	
}
