package exam02;

public class Circle extends Shape {
	
	int r;
	
	public Circle(int r) {
		this.r = r;
		
	}
	@Override
	public void draw() {
		 System.out.println(this.color + "색의" + 
		 this.r + "인 반지름의 원을 그립니다.");

	}

}
