package exam01;

import java.util.Arrays;

public class ArrayEx02 {

	public static void main(String[] args) {

		int[] arr = new int[] { 10, 200, 34, 42, 50 }; // 배열 선언과 동시에 초기화

		//출력방법 1 : for문이용
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i+" ");
		}
		System.out.println();
		
		
		//출력방법 2 : 개선된 for문이용
		//for(네이커 타입변수 : 배열)
		for(int i : arr) {
			System.out.println(i + " ");
		}
		System.out.println();
		
		
		//출력방법 3 : Array 클래스 이용
		System.out.println(Arrays.toString(arr));
		
		
	}

}
