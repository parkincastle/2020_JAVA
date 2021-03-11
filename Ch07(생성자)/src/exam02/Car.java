package exam02;

public class Car {

	//1.color(string), geerType(String)
	//	door(int), �� private  ��������� ����
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
		this("black", "����", 4);
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
		return "���� : " + getColor() + 
				", ��� Ÿ�� : "+getGeerType() + 
				", �� ���� : "+ getDoor();
				
		
	}
	
	
}
