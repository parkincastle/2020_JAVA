package exam04;

public class TriangleEx {

	public static void main(String[] args) {
		//삼각형의 밑변과 높이를 생성자로 초기화 한다
		Triangle tri = new Triangle(12.3);
		
		//넓이를 출력한다.
		System.out.println(tri.area());
		
	}

}
