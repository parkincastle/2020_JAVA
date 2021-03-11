package exam01;
//조상 클래스
class Bicycle {

	int id;
	String brand;

	@Override
	public String toString() {
		return this.id + "," + this.brand;
	}

}

public class BicycleEx {

	public static void main(String[] args) {
		
		Bicycle by = new Bicycle();
		System.out.println(by);
		
		by.id = 1111;
		by.brand = "삼천리";
		System.out.println(by);

		
	}

}
