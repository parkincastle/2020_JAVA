package exam02;

class Girl{
	
	String name;
	
	void show() {
		System.out.println("�׳�� �ʺ��� �̴�.");
	}
}

class GoodGirl extends Girl{
	
	void show() {
		System.out.println("�׳�� �ڹٸ� �߾ȴ�.");
	}
}

class BestGirl extends GoodGirl{
	
	void show() {
		System.out.println("�׳�� �ڹٸ� �����ϰ� ���Ѵ�.");
	}
}

public class GirlTest {

	public static void main(String[] args) {
		
//		Girl g1 = new BestGirl();
//		GoodGirl g2 = new GoodGirl();
//		BestGirl g3 = new BestGirl();
//		
//		g1.show();
//		g2.show();
//		g3.show();
		
		
		Girl g1 = new Girl();
		Girl g2 = new GoodGirl();
		Girl g3 = new BestGirl();
		
		g1.show();
		g2.show();
		g3.show();
		
		Girl gg[] = new Girl[] {new Girl(), new GoodGirl(), new BestGirl()};
		
		for(Girl g:gg) {
			//g
		}
		
		
		
		
	}

}
