package exam01;

//자식 클래스
//상속 : 공통된 코드는 부모에서 관리하고 개별적인부분은 자식에서 관리
//		 + 코드의 재사용성
//		 + is a 관계
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
		m1.frame = "알류미늄";
		m1.gear = 4;
		m1.price = 150;		
		m1.id = 1111;
		m1.brand = "삼천리";
		
		m1.Print();
		
	}
	
	
}
