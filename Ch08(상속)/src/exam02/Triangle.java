package exam02;

public class Triangle extends Shape{
	
	int x;
	int y;
	int z;
	
	public Triangle(int x, int y, int z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	@Override
	public void draw() {
		System.out.println(this.color + "색의" + 
		this.x + "," + this.y + "," + this.z + "의 삼각형을 그립니다.");
	}
	

}
