package exam01;

public class ArithmeticEx {

	public static void main(String[] args) {

		int a= 10;
		int b = 5;
		
		try {
		
		int c = a/b;
		System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println("��� ���� 0���� ������ ����.");
			
			
		}
		
		
	}

}
