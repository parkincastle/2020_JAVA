package exam04;

public class CharTest {
	
	public static void show(CharSequence c) {
		System.out.println(c);
	}
	
}
	
	public static void main(String[] args) {
		
		show(new String("¸àºØ"));
		show(new StringBuilder("meltdown"));
		show(new StringBuffer("!@#"));
		
	}
	
}
