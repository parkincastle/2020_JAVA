package exam09;

public class Bird implements Countable{

	String name;
	int num;
	
	@Override
	public void count() {
		System.out.println(this.name + "�� " + this.num + "���� �ִ�.");
	}
	
	public Bird(String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	public void fly() {
		System.out.println(this.num + "���� " +this.name + "�� ���ư���.");
	}
	
	
	
	

}
