package exam09;

public abstract class Countable2 {

	protected String name;
	protected int num;
	
	public Countable2(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}



	abstract void count();
	
	
}
