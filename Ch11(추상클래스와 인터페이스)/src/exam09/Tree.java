package exam09;

public class Tree implements Countable{
	
	String name;
	int num;

	@Override
	public void count() {
		System.out.println(this.name + "�� " + this.num + "�׷� �ִ�.");
	}

	public Tree(String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	public void ripen() {
		System.out.println(this.num + "�׷� " +this.name + "�� ���Ű� �� �;���.");
	}
	
	
}
