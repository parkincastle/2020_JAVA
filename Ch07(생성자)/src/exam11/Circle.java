package exam11;

public class Circle {

	int r;
	
	public Circle() {
		
	}
	
	public Circle(int r) {
		this.r = r;
	}

	public double area() {
		return r*r*3.14;
	}
	
	@Override
	public String toString() {
		return "�� ���� : " + r + " ���� : " + area();
	}
}
