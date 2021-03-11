package exam3;

public class ProductEx {
	
	public static void main(String[] args) {
	
		Product<Car, String> product1 = new Product<Car, String>();
		product1.setT(new Car("현대", 2020, 5));
		product1.setM("그랜저");
		System.out.println("브랜드 : " + product1.getT().getBrand());
		System.out.println("출시년도 : " + product1.getT().getYear());
		System.out.println("출시 월 : " + product1.getT().getMonth());
		System.out.println("차종 : " + product1.getM());
		
		Car car = product1.getT();
		String str = product1.getM();
		System.out.println("브랜드 : " + car.getBrand());
		System.out.println("출시년도 : " + car.getYear());
		System.out.println("출시 월 : " + car.getMonth());
		System.out.println("차종 : " + str);
		
		Product<TV, Integer> product2 = new Product<TV, Integer>();
		product2.setT(new TV(2020, 2, "SAMSUNG"));
		product2.setM(300);
		System.out.println("브랜드 : " + product2.getT().getBrand());
		System.out.println("출시 년 : " + product2.getT().getYear());
		System.out.println("출시 달 : " + product2.getT().getMonth());
		
	}
	
}
