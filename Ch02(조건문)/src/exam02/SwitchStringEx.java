package exam02;

import java.util.Scanner;

public class SwitchStringEx {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("직접입력 >>>");
		
		string str = sc.next();
		System.out.println(str);
		switch(str) {
		case "부장":
			System.out.println("400만원");
			break;
		case "과장":
			System.out.println("350만원");
			break;
		case "대리":
			System.out.println("300만원");
			break;
		default:
			System.out.println("200만원");
		}
		
	}

}
