package exam02;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է� : ");
		int n = sc.nextInt();
		System.out.println("n : " + n);
		System.out.println("n�� ���� : " + (n*n));
		
		//�ﰢ�� �غ��Է�
		System.out.println("�غ� �Է� : ");
		int x = sc.nextInt();
		
		//�ﰢ�� �����Է�
		System.out.println("���� �Է� : ");
		int y = sc.nextInt();
		
		//�ﰢ�� �������
		System.out.println("���� : " + ((x * y)/2.0 ));
		
		
		
	}

}
