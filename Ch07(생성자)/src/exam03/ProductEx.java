package exam03;

public class ProductEx {

	
	
	public static void main(String[] args) {
		
		//Product클래스를 이용해서 p1로드 하기
		Product p1 = new Product();
		
		//인스턴스 변수는 파일이름으로 불러온다
		System.out.println("number : " + Product.num); 
		System.out.println("cnt : " + p1.cnt);
		
		
		Product p2 = new Product();
		
		System.out.println("number : " + Product.num); 
		System.out.println("cnt : " + p2.cnt);
		

	}

}
