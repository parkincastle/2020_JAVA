package exam09;

public class Bird2 extends Countable2{
	
	@Override
	public void count() {
		System.out.println(this.name + "�� " + this.num + "���� �ִ�.");
	}
	
	public Bird2(String name, int num) {
		super(name, num);
	}
	
	public void fly() {
		System.out.println(this.num + "���� " +this.name + "�� ���ư���.");
	}
	
	
	
	

}
