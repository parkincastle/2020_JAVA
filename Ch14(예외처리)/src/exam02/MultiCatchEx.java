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
			
			System.out.println("�迭�� ������ �ʰ��Ͽ����ϴ�");
		} catch(ArithmeticException e) {
			
			System.out.println("0���� ������ �����ϴ�.");
		} finally{
			System.out.println("����");
		}
		
		
	}
	
	
}
