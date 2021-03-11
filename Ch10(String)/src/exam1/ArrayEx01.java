package exam1;

public class ArrayEx01 {

	public static void main(String[] args) {
		
		int[] arr1 = new int[3];
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		int[] arr2 = new int[] {10, 20, 30};
		
		int[] arr3;
		arr3 = new int[] {10, 20, 30};
		
		int[] arr4 = {10, 20, 30};
		
//		int[] arr5;
//		arr5 = {10, 20, 30}
		
		System.out.println(arr4.length);
		
		int[][] arr = new int[][] {
			{1, 2, 3},
			{3, 4, 5, 6, 7},
			{8, 9}
		};
		
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);
		
		
	}

}
