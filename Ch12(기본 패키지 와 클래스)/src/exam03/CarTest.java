package exam03;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

class Car{
	
	private String model;
	
	public Car(String model) {
		this.model = model;
		
	}
	
	@Override
	public String toString() {
		return "[" + this.model + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Car) {
			Car c = (Car)obj;
			if((this.model).equals(c.model)) {
				return true;
			}
		}
		return false;
	}
	
}


public class CarTest {

	public static void main(String[] args) {
		
		
		
		Car myCar = new Car("�׷���");
		Car yourCar = new Car("�׷���");
		
		if(myCar.equals(yourCar)) {
			System.out.println("�� �ڵ����� "+ myCar + "�� �ڵ����� "+ yourCar + "�̹Ƿ� ���� �����ϴ�");
		}
		
		else {
			System.out.println("�� �ڵ����� "+ myCar + "�� �ڵ����� "+ yourCar + "�̹Ƿ� ���� �ٸ���");
		}
		
		Date d = new Date();
		
		SimpleDateFormat s = new SimpleDateFormat("MM-dd-yyyy");
		String str = MessageFormat.format("��¥ : {0}, �ڵ��� �� : {1}, ������ : {2}", 
				s.format(d), myCar, "���μ�");
		System.out.println(str);
		
		StringTokenizer s1 = new StringTokenizer(str, ",:[] ") ;
		while(s1.hasMoreTokens())
			System.out.println(s1.nextToken());
		
		
	}
	
}
