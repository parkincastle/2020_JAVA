package exam03;

class Phone{
	
	protected String owner;
	
	public Phone(String owner) {
		this.owner = owner;
		
	}
	
	void talk() {
		System.out.println(this.owner + "�� ��ȭ �� �̴�.");
	}
	
}

class Telephone extends Phone{
	
	private String when;
	
	public Telephone(String owner, String when) {
		super(owner);
		this.when = when;
	}
	
	public String getWhen() {
		return when;
	}

	void autoAnswering() {
		System.out.println(this.owner + "����. " + this.getWhen() + " ��ȭ �ٷ�?");
	}
	
}

class Smartphone extends Phone{
	
	private String game;
	
	public Smartphone(String owner, String game) {
		super(owner);
		this.game = game;
	}
	
	public String getGame() {
		return game;
	}

	void playGame() {
		System.out.println(this.owner + "�� " + this.getGame() + "������ �ϴ� ���̴�.");
	}
	
}

public class PhoneEx {

	public static void main(String[] args) {
		
		Phone[] phones = { new Phone("Ȳ����"), new Telephone("�浿��", "����"), new Smartphone("�α���", "������")};
		
		for(Phone i : phones) {
			if(i instanceof Telephone) {
				((Telephone)i).autoAnswering();
			}
			else if(i instanceof Smartphone) {
				((Smartphone)i).playGame();
			}
			else {
				i.talk();
			}
			
		}
		
		
		
	}

}
