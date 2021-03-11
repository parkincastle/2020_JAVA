package exam01;

import java.util.Arrays;

public class ArrayIndexOutOfBoundsEx {

	public static void main(String[] args) {

		int[] arr = new int[5];
		System.out.println(Arrays.toString(arr));
		
		try {
		for(int i = 0; i < 6; i++) {
			arr[i] = 10;
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 넘어선 에러");
		}
		
		
		
	}

}
