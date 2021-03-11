package exam01;

import java.util.Scanner;

public class ForEx04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 단 입력 >>>");
		int num = sc.nextInt();
		for(int i = 1;i <= 9;i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
		
		
		
		
		
	}
	
}
