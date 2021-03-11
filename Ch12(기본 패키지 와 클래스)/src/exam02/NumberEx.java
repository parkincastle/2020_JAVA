package exam02;

// number클래스 : 숫자를 클래스 처럼 접근하고 싶을때 사용
// Boxing = 숫자들을 클래스로 포장
// unboxing = 클래스로 사용했던걸 다시 숫자로 쓰는거

public class NumberEx {

	public static void main(String[] args) {

		Integer i1 = new Integer(10); //Integer타입의 객체 생성(=인스턴스)
		int a = i1.intValue();
		System.out.println(a);
		
		Double d1 = new Double(3.14);
		System.out.println(d1.floatValue());
		
		
		Integer i2 = 20; //자동 boxing
		int b = i2 + 40; //자동 unboxing
		System.out.println(b);
		
		String s1 = Double.toString(3.14);
		System.out.println(s1.charAt(0)); // 문자이므로 chatAt()이 가능하다.
		
		
		double c = 3.14;
		
		
	}

}
