package exam02;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력 >>>");
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
			System.out.println("A등급");
			break;
			
		case 9:
			System.out.println("B등급");
			break;
			
		default:
			System.out.println("C등급");
			break;
		}
		
		
		
		
		
	}

}
