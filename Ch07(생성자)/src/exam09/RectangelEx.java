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
		
		System.out.println("�ʺ�, ���� �Է� : ");
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.println("�簢���� ���� : " + r1.Sum(n, m));
		
	}

}
