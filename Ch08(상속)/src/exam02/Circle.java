package exam02;

public class Circle extends Shape {
	
	int r;
	
	public Circle(int r) {
		this.r = r;
		
	}
	@Override
	public void draw() {
		 System.out.println(this.color + "����" + 
		 this.r + "�� �������� ���� �׸��ϴ�.");

	}

}
