package exam01;

// �������̵� : ��ӹ޾��� �� ������ �ٸ��� �Ҽ� �ִ� �� 
class Car{
	
	String name = "�ڵ���";
	
	void whoami() {
		System.out.println(name + "�ڵ��� �̴�.");
	}
	
}

class sportCar extends Car{
		
	String name = "������ī";
	
	void whoami() {
		System.out.println("���� ������ī �̴�.");
	}
	
	static void move() {
		System.out.println("������ī�� �̵��Ѵ�.");
	}
	
}

class suv extends Car{
	@Override
	void whoami() {
		System.out.println("���� suv�̴�");
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
		 * //Upĳ���� Car c2 = new sportCar(); System.out.println(c2.name);
		 * 
		 * //��ӵǾ����� �޼���� �������̵� �� �޼���(=�ڽ� �޼���)�� ����Ѵ�. c2.whoami();
		 * 
		 * 
		 * //���� ����ȯ(down ĳ���� �ȵ�) // sportCar s2 = (sportCar)new Car(); //
		 * System.out.println(s2.name);
		 */		
		
		//�پ缺 : �ϳ��� ���������� �پ��� �J�츦 �����Ͽ� �����Ѵ�.
		
		//Car�迭
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
