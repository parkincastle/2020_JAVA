package exam11;

public class CircleEx {

	public static void main(String[] args) {
		
//		Circle c1 = new Circle(5);
//		Circle c2 = new Circle(10);
//		
//		System.out.println(c1);
//		System.out.println(c2);
		
		Circle[] c = new Circle[5];
//		c[0] = new Circle(5);
//		System.out.println(c[0]);
		
		for(int i = 0; i < 5; i++) {
			c[i] = new Circle((i + 1)*5);
			System.out.println(c[i]);
		}
	}
	
}
