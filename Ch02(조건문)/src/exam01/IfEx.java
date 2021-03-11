package exam01;

import java.util.Scanner;

public class IfEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int n = sc.nextInt();
		
		
		if(n >= 80) {
			System.out.println("상");
		}
		else if(n >= 60){
			System.out.println("중");
		}
		else {
			System.out.println("하");
		}
	
		
		
	}
	
}
