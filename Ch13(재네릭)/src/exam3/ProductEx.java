package exam3;

public class ProductEx {
	
	public static void main(String[] args) {
	
		Product<Car, String> product1 = new Product<Car, String>();
		product1.setT(new Car("����", 2020, 5));
		product1.setM("�׷���");
		System.out.println("�귣�� : " + product1.getT().getBrand());
		System.out.println("��ó⵵ : " + product1.getT().getYear());
		System.out.println("��� �� : " + product1.getT().getMonth());
		System.out.println("���� : " + product1.getM());
		
		Car car = product1.getT();
		String str = product1.getM();
		System.out.println("�귣�� : " + car.getBrand());
		System.out.println("��ó⵵ : " + car.getYear());
		System.out.println("��� �� : " + car.getMonth());
		System.out.println("���� : " + str);
		
		Product<TV, Integer> product2 = new Product<TV, Integer>();
		product2.setT(new TV(2020, 2, "SAMSUNG"));
		product2.setM(300);
		System.out.println("�귣�� : " + product2.getT().getBrand());
		System.out.println("��� �� : " + product2.getT().getYear());
		System.out.println("��� �� : " + product2.getT().getMonth());
		
	}
	
}
