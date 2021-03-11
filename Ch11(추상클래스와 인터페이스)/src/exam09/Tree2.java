package exam09;

public class Tree2 extends Countable2{

	@Override
	public void count() {
		System.out.println(this.name + "가 " + this.num + "그루 있다.");
	}

	public Tree2(String name, int num) {
		super(name, num);
	}
	
	public void ripen() {
		System.out.println(this.num + "그루 " +this.name + "에 열매가 잘 익었다.");
	}
	
	
}
