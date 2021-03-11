package exam03;

class Phone{
	
	protected String owner;
	
	public Phone(String owner) {
		this.owner = owner;
		
	}
	
	void talk() {
		System.out.println(this.owner + "가 통화 중 이다.");
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
		System.out.println(this.owner + "없다. " + this.getWhen() + " 전화 줄래?");
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
		System.out.println(this.owner + "가 " + this.getGame() + "게임을 하는 중이다.");
	}
	
}

public class PhoneEx {

	public static void main(String[] args) {
		
		Phone[] phones = { new Phone("황진이"), new Telephone("길동이", "내일"), new Smartphone("민국이", "갤러그")};
		
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
