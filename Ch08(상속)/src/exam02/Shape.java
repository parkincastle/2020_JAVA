package exam02;

//final접근자
// 1.상수에 이용 : final String color = "red";
// 2.메서드에 이용 : 오버라이드 안됨. : final public void draw()
// 3.클래스에 이용 : 상속 안됨 : final public class Shape
public class Shape {
	
	final String color = "red";
	
	public void draw() {
		System.out.println(this.color + "색의 모양을 그립니다.");
	}

}
