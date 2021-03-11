package exam09;

public class Bird implements Countable{

	String name;
	int num;
	
	@Override
	public void count() {
		System.out.println(this.name + "가 " + this.num + "마리 있다.");
	}
	
	public Bird(String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	public void fly() {
		System.out.println(this.num + "마리 " +this.name + "가 날아간다.");
	}
	
	
	
	

}
