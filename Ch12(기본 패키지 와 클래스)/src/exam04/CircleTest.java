package exam04;

class Circle{
	
	int num;
	
	public Circle(int num) {
		this.num = num;
	}
	
	
	
}


public class CircleTest {

	public static void main(String[] args) {

		Circle c1 = new Circle(3);
		Circle c2 = new Circle(3);
		
		if (c1.equals(c2)) {
			System.out.println("c1�� c2�� ����.");
		}
		else {
			System.out.println("c1�� c2�� �ٸ���.");
		}
		
		
		
	}

}
