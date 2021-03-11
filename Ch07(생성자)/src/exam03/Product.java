package exam03;

public class Product {

	//변수선언 (default)
	static int num;
	int cnt;
	
	
	//기본생성자
	public Product() {
		System.out.println("기본생성자 호출됨");
	}
	
	//인스턴스 블록 호출됨
	{
		System.out.println("인스턴스 블록 호출됨");
		cnt++;
		num++;
	}
	
	static {
		System.out.println("스태틱 블록 호출됨");
	}
	
}
