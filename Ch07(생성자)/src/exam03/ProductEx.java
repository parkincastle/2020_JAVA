package exam03;

public class ProductEx {

	
	
	public static void main(String[] args) {
		
		//ProductŬ������ �̿��ؼ� p1�ε� �ϱ�
		Product p1 = new Product();
		
		//�ν��Ͻ� ������ �����̸����� �ҷ��´�
		System.out.println("number : " + Product.num); 
		System.out.println("cnt : " + p1.cnt);
		
		
		Product p2 = new Product();
		
		System.out.println("number : " + Product.num); 
		System.out.println("cnt : " + p2.cnt);
		

	}

}
