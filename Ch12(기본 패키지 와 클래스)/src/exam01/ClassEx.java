package exam01;

public class ClassEx {
	
	public static void main(String[] args) {
		
		Keyboard k = new Keyboard("SAMSUNG");
		
		Class c = k.getClass();
		System.out.println(c.getName());
		System.out.println(c.getSimpleName());
		
	}
	
}
