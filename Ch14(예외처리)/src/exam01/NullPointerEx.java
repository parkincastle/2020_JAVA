package exam01;

public class NullPointerEx {

	public static void main(String[] args) {

		String str = null;
		
		try {
		System.out.println(str.toString());
		}
		catch(Exception e) {
			System.out.println("�ּҰ� null�Դϴ�.");
		}
		
	}

}
