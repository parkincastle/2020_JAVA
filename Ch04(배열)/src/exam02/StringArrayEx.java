package exam02;

public class StringArrayEx {

	//String �迭
	public static void main(String[] args) {

		String[] str = new String[] {"KIM", "LEE", "HAN"};
		
		System.out.println("for���� �̿��� ���");
		
		for(int i= 0; i < str.length; i++) {
			
			System.out.println(str[i] + " ");
		}
		System.out.println();
		
		System.out.println("������ for���� �̿��� ���");
		
		for(String tmp : str) {
			
			System.out.println(tmp + " ");
		}
		System.out.println();
		System.out.println("Array");
		System.out.println("for���� �̿��� ���");
		
		
		
	}

}