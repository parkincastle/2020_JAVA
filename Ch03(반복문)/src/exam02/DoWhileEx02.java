package exam02;

import java.util.Scanner;

public class DoWhileEx02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str;
		do {
			System.out.println("���� �Է� : ");
			str = sc.next();
			System.out.println("�Էµ� ���� : " + str);
//			if(str.equals("q")) {
//				break;
//			}
		} while (!str.equals("q"));
		sc.close();
		System.out.println("���α׷� ����");

	}

}
