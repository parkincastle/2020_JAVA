package exam02;

public class StringArrayEx {

	//String 배열
	public static void main(String[] args) {

		String[] str = new String[] {"KIM", "LEE", "HAN"};
		
		System.out.println("for문을 이용한 출력");
		
		for(int i= 0; i < str.length; i++) {
			
			System.out.println(str[i] + " ");
		}
		System.out.println();
		
		System.out.println("개선된 for문을 이용한 출력");
		
		for(String tmp : str) {
			
			System.out.println(tmp + " ");
		}
		System.out.println();
		System.out.println("Array");
		System.out.println("for문을 이용한 출력");
		
		
		
	}

}