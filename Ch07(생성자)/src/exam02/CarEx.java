package exam02;

public class CarEx {

	public static void main(String[] args) {
	
	//4. ���� �⺻���� �⺻ �����ڸ� �̿��ؼ� �ʱ�ȭ
	//black, ����, 4
	Car car1 = new Car("black", "����", 4);
	System.out.println(car1);
	//My car�ֹ� : "red", "����", 2
	Car car2 = new Car("red", "����", 2);
	System.out.println(car2);
	Car car3 = new Car("White");
	System.out.println(car3);
	Car car4 = new Car(car1);
	System.out.println(car4);
	
	
	
	}
	
}
