package exam02;

public class StringEx {

	public static void main(String[] args) {
		
		//기본변수 (8개) ; 값저장, 참도변수  : 주소 (new연산자)
		//Scanner sc; = 참조변수
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println(str1);
		System.out.println(str2);
		if(str1 == str2) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
		if(str1.equals(str2)) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
		
	}
	
}
