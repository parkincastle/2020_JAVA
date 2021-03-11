package exam02;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int n = sc.nextInt();
		System.out.println("n : " + n);
		System.out.println("n의 제곱 : " + (n*n));
		
		//삼각형 밑변입력
		System.out.println("밑변 입력 : ");
		int x = sc.nextInt();
		
		//삼각형 높이입력
		System.out.println("높이 입력 : ");
		int y = sc.nextInt();
		
		//삼각형 넓이출력
		System.out.println("넓이 : " + ((x * y)/2.0 ));
		
		
		
	}

}
