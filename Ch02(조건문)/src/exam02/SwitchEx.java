package exam02;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է� >>>");
		int score = sc.nextInt();
		
//		if(score >= 90) {
//			System.out.println("A");
//		}
//		else if(score >= 80) {
//			System.out.println("B");
//		}
//		else {
//			System.out.println("C");
//		}
		
		
		switch(score/10) {
		case 10:
			System.out.println("A���");
			break;
			
		case 9:
			System.out.println("B���");
			break;
			
		default:
			System.out.println("C���");
			break;
		}
		
		
		
		
		
	}

}
