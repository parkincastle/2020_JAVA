package exam03;

class Circle{
	
	private int radius;
	
	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	void show() {
		System.out.println("반지름 이 " + this.radius + "인 원 이다.");
	}

	public int getRadius() {
		return radius;
	}
	
	
}

class ColoredCircle extends Circle{
	
	String colcor;
	
	public ColoredCircle(int radius, String color) {
		super(radius);
		this.colcor = color;
	}
	
	@Override
	void show() {
		
		System.out.println("반지름 이 " + this.getRadius() + "인" + this.colcor + "색 원 이다.");
	}
	
}

public class CircleEx {

	public static void main(String[] args) {
		
		Circle c = new Circle(5);
		ColoredCircle cc = new ColoredCircle(10, "빨간색");
		c.show();
		cc.show();
		
	}

}
