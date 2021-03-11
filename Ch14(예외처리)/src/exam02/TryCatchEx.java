package exam02;

public class TryCatchEx {
	
	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(4/0);
			System.out.println(5);
		}
		catch(ArithmeticException e) {
			System.out.println(6);
		}
		System.out.println(7);
		
	}
	
}
