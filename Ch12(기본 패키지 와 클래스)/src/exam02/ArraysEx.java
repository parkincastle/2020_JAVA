package exam02;

import java.util.Arrays;

public class ArraysEx {

	public static void main(String[] args) {

		String[] str = {"Apple", "Cake", "Peanut", "Banana", "Orange"};
		System.out.println(Arrays.toString(str));
		
		// Arrays.sort
		Arrays.sort(str);
		System.out.println(Arrays.toString(str));
		
		// Arrays.fill
		Arrays.fill(str, 2,3,"Carrot");
		System.out.println(Arrays.toString(str));
		
		
		
		
	}

}
