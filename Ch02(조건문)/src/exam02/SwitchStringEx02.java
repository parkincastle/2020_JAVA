package exam02;

import java.util.Scanner;

public class SwitchStringEx02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �Է��ϼ��� >>>");
		string str = sc.next();
		
		switch(str) {
		case "A":
			System.out.println("�����ٰ��ϰ� ����� ���پȴ�.");
			break;
		case "B":
			System.out.println("������ ���ϰ� �ڱ��߽����̴�.");
			break;
		case "O":
			System.out.println("����Ͽ� �������̰� �������� �ִ�.");
			break;
		case "AB":
			System.out.println("�γ�ȸ���� ������.");
			break;
		}
		
		
		
		
	}

}
