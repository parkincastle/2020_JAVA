package exam07;

public class PersonEx {

	public static void main(String[] args) {

		MyInterface myInterface = new Person();
		myInterface.method();
		myInterface.dmethod();
		
		System.out.println(MyInterface.MAX);
		System.out.println(MyInterface.MIN);
		
		
		
	}

}
