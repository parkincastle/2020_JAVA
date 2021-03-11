package exam02;

import java.util.Scanner;

public class SwitchStringEx02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("혈액형을 입력하세요 >>>");
		string str = sc.next();
		
		switch(str) {
		case "A":
			System.out.println("다정다감하고 배려를 할줄안다.");
			break;
		case "B":
			System.out.println("개성이 강하고 자기중심적이다.");
			break;
		case "O":
			System.out.println("모든일에 적극적이고 리더쉽이 있다.");
			break;
		case "AB":
			System.out.println("두뇌회전이 빠르다.");
			break;
		}
		
		
		
		
	}

}
