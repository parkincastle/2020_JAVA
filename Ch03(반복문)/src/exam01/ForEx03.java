package exam01;

import java.util.Scanner;

public class ForEx03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("10���� ���� �Է� : ");
		for(int i = 0; i < 10; i++) {
			int a = sc.nextInt();
			if(a % 2 == 0) {
				System.out.println(i + " ");
			}
			
		}

	}

}
