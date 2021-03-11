package exam09;

import java.util.Scanner;

public class RectangelEx {

	private int width;
	private int height;
	
	public double Sum(int width, int height) {
		this.height = height;
		this.width = width;
		return this.height*this.width;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		RectangelEx r1 = new RectangelEx();
		
		System.out.println("너비, 높이 입력 : ");
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.println("사각형의 면적 : " + r1.Sum(n, m));
		
	}

}
