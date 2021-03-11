package exam02;

public class Car {

	//1.color(string), geerType(String)
	//	door(int), 를 private  멤버변수로 선언
	private String color;
	private String geerType;
	private int door;
	
	//2.
	public String getColor() {
		return color;
	}
	
	public String getGeerType() {
		return geerType;
	}
	
	public int getDoor() {
		return door;
	}
	
	public Car() {
		this("black", "오토", 4);
	}
	
	public Car(String color , String geerType,int door) {
		this.color = color;
		this.geerType = geerType;
		this.door = door;
	}
	
	public Car(String color) {
		this();
		this.color = color;
		
	}
	
	public Car(Car car1) {
		this.color = car1.color;
		this.geerType = car1.geerType;
		this.door = car1.door;
	}
	
	//3.
	@Override
	public String toString() {
		return "색깔 : " + getColor() + 
				", 기어 타입 : "+getGeerType() + 
				", 문 개수 : "+ getDoor();
				
		
	}
	
	
}
