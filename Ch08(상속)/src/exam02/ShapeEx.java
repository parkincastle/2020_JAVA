package exam02;

public class ShapeEx {

	public static void main(String[] args) {
		
		Shape sh = new Shape();
		sh.draw();
		
		Circle c1 = new Circle(5);
		c1.draw();
		
		Triangle t1 = new Triangle(3,3,3);
		t1.draw();
		
		
	}

}
