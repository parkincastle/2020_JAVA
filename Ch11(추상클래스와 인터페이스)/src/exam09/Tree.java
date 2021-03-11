package exam09;

public class Tree implements Countable{
	
	String name;
	int num;

	@Override
	public void count() {
		System.out.println(this.name + "가 " + this.num + "그루 있다.");
	}

	public Tree(String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	public void ripen() {
		System.out.println(this.num + "그루 " +this.name + "에 열매가 잘 익었다.");
	}
	
	
}
