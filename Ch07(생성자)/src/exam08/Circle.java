package exam08;

public class Circle {
	
	private int radius;
	private String name;
	
	public Circle() {
		System.out.println("�⺻������ ȣ��");
	}
	
	public Circle(int radius, String name) {
		this.radius = radius;
		this.name = name;
	}
	
	public void area() {
		double a = this.getRadius()*this.getRadius()*3.14;
		System.out.println(this.name + "�� ������ : " + this.radius + " ���� : " + a);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
