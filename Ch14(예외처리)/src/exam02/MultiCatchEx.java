package exam02;

import java.util.Arrays;

public class MultiCatchEx {

	public static void main(String[] args) {
		
		try {
			int[] arr = new int[3];
			System.out.println(Arrays.toString(arr));
			arr[3] = 100;
			int result = 10/0;
			System.out.println(result);
		} catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("배열의 범위를 초과하였습니다");
		} catch(ArithmeticException e) {
			
			System.out.println("0으로 나눌수 없습니다.");
		} finally{
			System.out.println("종료");
		}
		
		
	}
	
	
}
