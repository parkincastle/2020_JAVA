package exam09;

public class Tree2 extends Countable2{

	@Override
	public void count() {
		System.out.println(this.name + "�� " + this.num + "�׷� �ִ�.");
	}

	public Tree2(String name, int num) {
		super(name, num);
	}
	
	public void ripen() {
		System.out.println(this.num + "�׷� " +this.name + "�� ���Ű� �� �;���.");
	}
	
	
}
