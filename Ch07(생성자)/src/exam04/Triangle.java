package exam04;
//삼각형의 밑변과 높이를 선언한다.
//생성자(매개변수 2개)
//멤버메서드 : 넓이 구하기 - area()

public class Triangle {

	//선언
	double under;
	double height;
	
	//생성자
	public Triangle() {
		this(1,3.6);
	}
	
	public Triangle(double under, double height) {
		this.under = under;
		this.height = 3.6;
	}
	public Triangle(double under) {
		this();
		this.under = under;
	}
	
	//넓이 구하는 메서드 만들고 출력
	public double area() {
		return (this.under*this.height)/2;
	}
	
}
