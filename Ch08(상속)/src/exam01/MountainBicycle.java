package exam01;

//�ڽ� Ŭ����
//��� : ����� �ڵ�� �θ𿡼� �����ϰ� �������κκ��� �ڽĿ��� ����
//		 + �ڵ��� ���뼺
//		 + is a ����
public class MountainBicycle extends Bicycle{

	String frame;
	int gear;
	int price;
	
	public void Print() {
		System.out.println("frame : " + this.frame);
		System.out.println("gear : " + this.gear);
		System.out.println("price : " + this.price);
		System.out.println("id : " + this.id);
		System.out.println("brand : " + this.brand);
	}
	
	public static void main(String[] args) {
		
		MountainBicycle m1 = new MountainBicycle();
		m1.frame = "�˷��̴�";
		m1.gear = 4;
		m1.price = 150;		
		m1.id = 1111;
		m1.brand = "��õ��";
		
		m1.Print();
		
	}
	
	
}
