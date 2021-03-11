package exam09;

public class Bird2 extends Countable2{
	
	@Override
	public void count() {
		System.out.println(this.name + "가 " + this.num + "마리 있다.");
	}
	
	public Bird2(String name, int num) {
		super(name, num);
	}
	
	public void fly() {
		System.out.println(this.num + "마리 " +this.name + "가 날아간다.");
	}
	
	
	
	

}
