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
		
		
		
		Car myCar = new Car("그랜저");
		Car yourCar = new Car("그랜저");
		
		if(myCar.equals(yourCar)) {
			System.out.println("내 자동차는 "+ myCar + "너 자동차는 "+ yourCar + "이므로 모델이 동일하다");
		}
		
		else {
			System.out.println("내 자동차는 "+ myCar + "너 자동차는 "+ yourCar + "이므로 모델이 다르다");
		}
		
		Date d = new Date();
		
		SimpleDateFormat s = new SimpleDateFormat("MM-dd-yyyy");
		String str = MessageFormat.format("날짜 : {0}, 자동차 모델 : {1}, 운전자 : {2}", 
				s.format(d), myCar, "박인성");
		System.out.println(str);
		
		StringTokenizer s1 = new StringTokenizer(str, ",:[] ") ;
		while(s1.hasMoreTokens())
			System.out.println(s1.nextToken());
		
		
	}
	
}
