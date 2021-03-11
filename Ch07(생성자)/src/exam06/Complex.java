package exam06;

public class Complex {
	
	double a,b;
	
	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
		System.out.println(a + " + " +  b + "i");
	}
	
	public Complex(double a) {
		this.a = a;
		System.out.println(a + " + " +  b + "i");
	}
	
	public Complex() {
		System.out.println(a + " + " +  b + "i");
	}
	
	
}
