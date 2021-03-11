package exam03;

class Vehicle{
	
	String color;
	int speed;
	
	void show() {
		System.out.println("색깔 : " + this.color + ", 속도 : " + this.speed);
	}
	
	public Vehicle(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}
}

class Car extends Vehicle{
	
	int displacement;
	int gears;
	
	void show() {
		System.out.println("색깔 : " + this.color + ", 속도 : " + this.speed + ", 배기량 : " + this.displacement + ", 기어 단수 : " + this.gears);
	}
	
	public Car(String color, int speed, int displacement, int gears) {
		super(color, speed);
		this.displacement = displacement;
		this.gears = gears;
	}
}

public class OverrideEx {

	public static void main(String[] args) {
		Car c = new Car("파랑", 100, 1000, 5);
		c.show();
		
		System.out.println();
		Vehicle v = c;
		v.show();
	}

}
