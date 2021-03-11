package exam02;

public class CarEx {

	public static void main(String[] args) {
	
	//4. 차의 기본형을 기본 생성자를 이용해서 초기화
	//black, 오토, 4
	Car car1 = new Car("black", "오토", 4);
	System.out.println(car1);
	//My car주문 : "red", "수동", 2
	Car car2 = new Car("red", "수동", 2);
	System.out.println(car2);
	Car car3 = new Car("White");
	System.out.println(car3);
	Car car4 = new Car(car1);
	System.out.println(car4);
	
	
	
	}
	
}
