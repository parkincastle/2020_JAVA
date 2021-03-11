package exam03;

public abstract class Computer {

	public void turnon() {
		System.out.println("전원을 킵니다.");
	}
	public void turnoff() {
		System.out.println("전원을 끕니다.");
	}
	
	public abstract void display();
	
	public abstract void typing();
	
	
	
}
