package exam01;

import java.util.Arrays;

public class ArrayEx03 {

	public static void main(String[] args){
		
		int[] arr = new int[5];
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = (int)(Math.random() * 100)+1;
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}
}
