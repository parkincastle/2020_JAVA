package exam02;

import java.util.Scanner;

public class SwitchStringEx {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է� >>>");
		
		string str = sc.next();
		System.out.println(str);
		switch(str) {
		case "����":
			System.out.println("400����");
			break;
		case "����":
			System.out.println("350����");
			break;
		case "�븮":
			System.out.println("300����");
			break;
		default:
			System.out.println("200����");
		}
		
	}

}
