package exam03;

class Point{
	
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	@Override
	public String toString() {
		return getX() + ", " + getY();
	}
	
}

class MovablePoint extends Point{
	private int xspeed, yspeed;
	
	public MovablePoint(int x, int y, int xspeed, int yspeed) {
		super(x, y);
		this.xspeed = xspeed;
		this.yspeed = yspeed;
	}

	public int getXspeed() {
		return xspeed;
	}

	public int getYspeed() {
		return yspeed;
	}
	
	@Override
	public String toString() {
		return getX() + ", " + getXspeed() + ", " + getY() + ", " + getYspeed();
	}
	
}

public class PointEx {

	public static void main(String[] args) {
		
		Point p = new Point(10, 20);
		MovablePoint m = new MovablePoint(20, 30, 100, 80);
		
		System.out.println(p);
		System.out.println(m);
		
	}

}
