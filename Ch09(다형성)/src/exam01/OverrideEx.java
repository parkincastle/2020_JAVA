package exam01;

// 오버라이드 : 상속받았을 때 내용을 다르게 할수 있는 것 
class Car{
	
	String name = "자동차";
	
	void whoami() {
		System.out.println(name + "자동차 이다.");
	}
	
}

class sportCar extends Car{
		
	String name = "스포츠카";
	
	void whoami() {
		System.out.println("나는 스포츠카 이다.");
	}
	
	static void move() {
		System.out.println("스포츠카는 이동한다.");
	}
	
}

class suv extends Car{
	@Override
	void whoami() {
		System.out.println("나는 suv이다");
	}
}

public class OverrideEx {

	public static void main(String[] args) {

		/*
		 * Car c = new Car(); System.out.println(c.name); c.whoami(); // c.move();
		 * 
		 * sportCar s = new sportCar(); System.out.println(s.name); s.whoami();
		 * s.move();
		 * 
		 * //Up캐스팅 Car c2 = new sportCar(); System.out.println(c2.name);
		 * 
		 * //상속되었을때 메서드는 오버라이드 된 메서드(=자식 메서드)를 출력한다. c2.whoami();
		 * 
		 * 
		 * //강제 형변환(down 캐스팅 안됨) // sportCar s2 = (sportCar)new Car(); //
		 * System.out.println(s2.name);
		 */		
		
		//다양성 : 하나의 참조변수에 다양한 캨헤를 대입하여 저장한다.
		
		//Car배열
//		Car[] c= new Car[3]; //=> Car c1,c2,c3
//		c[0] =  new sportCar();
//		c[1] = new suv();
//		c[2] = new Car();
		
		Car[] c = new Car[] {new sportCar(), new suv(), new Car()};
//		Car c1 = new sportCar();
//		Car c2 = new suv();
//		Car c3 = new Car();
		
//		c1.whoami(); 
//		c2.whoami();
//		c3.whoami();
		
		for(Car i : c) {
			i.whoami();
		}
		
		
	}

}
