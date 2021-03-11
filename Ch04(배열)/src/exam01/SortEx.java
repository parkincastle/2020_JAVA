package exam01;

import java.util.Arrays;
import java.util.Collections;

public class SortEx {

	//정렬 프로그램
	public static void main(String[] args) {
		
		int[] arr = new int[] {10, 84, 72, 100, 26};
		
		System.out.println("정렬 전 : ");
		System.out.println(Arrays.toString(arr));
		int temp;
		
		//버블소트
//		for(int i = 0; i < arr.length; i++) {
//			
//			for(int j = 0; j< arr.length - 1; j++) {
//				
//				if(arr[j] > arr[j+1]) {
//					
//					temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}
		
//		//선택정렬
//		for(int i = 0; i < 5; i++) {
//			
//			for(int j = i + 1; j < arr.length; j++) {
//				
//				if(arr[i] > arr[j]) {
//					
//					temp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = temp;
//				}
//			}
//		}
		
		//Arrays 클래스 이용
		Arrays.sort(arr);
		
		System.out.println("정렬 후 : ");		
		System.out.println(Arrays.toString(arr));
		//Array.sort(arr, )

	}

}
