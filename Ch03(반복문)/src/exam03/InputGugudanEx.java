package exam03;

import java.util.Scanner;

public class InputGugudanEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("처음단 : ");
		int start = sc.nextInt();
		System.out.println("마지막단 : ");
		int end = sc.nextInt();

		for (int i = start; i <= end; i++) {
			for (int j = 2; j <= 9; j++) {
				// System.out.println(i+"*"+j+"="+(i*j));
				System.out.printf("%d * %d = %2d", i, j, i * j);
			}
			System.out.println();
		}

	}
}