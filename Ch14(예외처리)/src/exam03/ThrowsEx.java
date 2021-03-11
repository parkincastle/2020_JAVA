package exam03;

public class ThrowsEx {

	public static void main(String[] args) {

		try {
			method1();
		}
		catch(Exception e) {
			System.out.println("0으로 나눌수 없다.");
		}
		
		
	}
	
	public static void method1() throws Exception{
		method2();
		
	}
	public static void method2() throws Exception {
		System.out.println(10/0);
	}

}
