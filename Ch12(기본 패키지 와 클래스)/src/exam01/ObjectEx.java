package exam01;

class Mouse{
	
	String name;

	public Mouse(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Keyboard) {
			Keyboard k = ((Keyboard)obj);
			if(name.equals(k.name)) {
				return true;
			}
		}
		return false;
	}
	
	
}

class Keyboard{
	
	String name;

	public Keyboard(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "키보드 입니다.";
		
	}
	
	
}

public class ObjectEx {

	public static void main(String[] args) {
		
		Mouse mouse1 = new Mouse("Logitech");
		Mouse mouse2 = new Mouse("Logitech");
		System.out.println(mouse1.toString());
		System.out.println(mouse1);
		
		System.out.println(mouse1.equals(mouse2));
		
		Keyboard keyboard1 = new Keyboard("SAMSUNG");
		Keyboard keyboard2 = new Keyboard("SAMSUNG");
		System.out.println(keyboard1.toString());
		System.out.println(keyboard1);
		
		
	}

}
