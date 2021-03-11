package exam01;

class Shape{
	
	
	
}

class Retangle extends Shape{
	
	
	
}

class Circle extends Shape{
	
	
}

public class CalstExceptionEx {

	public static void main(String[] args) {

		Retangle r = new Retangle();
		try {
		casting(r);
		}
		catch(ClassCastException e) {
			System.out.println("형 변환 에러");
		}
	}

	
	static void casting(Shape s) throws ClassCastException{
//		Shape c = s;
		
		
		Circle c = (Circle)s;
	}
}
