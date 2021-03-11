package exam07;

public class Triangle {

	double under, height;
	
	public Triangle(double under, double height) {
		this.height = height;
		this.under = under;
	}
	
	public double findArea() {
		return (this.under * this.height) / 2;
	}
	
	public boolean isSameArea(Triangle a) {
		if(this.findArea() == a.findArea()) {
			 return true;
		}
		else {
			return false;
		}
		
	}
}
