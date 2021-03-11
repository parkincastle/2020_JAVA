package exam02;

import java.util.Scanner;

public class DoWhileEx02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str;
		do {
			System.out.println("문자 입력 : ");
			str = sc.next();
			System.out.println("입력된 문자 : " + str);
//			if(str.equals("q")) {
//				break;
//			}
		} while (!str.equals("q"));
		sc.close();
		System.out.println("프로그램 종료");

	}

}
