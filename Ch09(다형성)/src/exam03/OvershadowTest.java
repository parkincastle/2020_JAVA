package exam03;

class Parent{
	
	String name = "����";
	
	void print() {
		System.out.println("���� �絵���� �̴�.");
	}
}

class Child extends Parent{
	
	String name = "�絵����";
	
//	@Override
//	void print() {
//		System.out.println("���� �絵���� �̴�.");
//
//	}
}

public class OvershadowTest {

	public static void main(String[] args) {
		
		Parent p = new Child();
		System.out.println(p.name);
		p.print();
		
		
		
		
		
		
	}

}
