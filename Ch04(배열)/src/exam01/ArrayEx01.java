package exam01;

public class ArrayEx01 {

	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,3,4,5}; //배열 선언과 동시에 초기화
		
		for(int i = 0; i < 5; i++ ) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("------------------------------------");;
		int n = arr.length;
		arr[2] = 100;//변수처럼 값 저장
		for(int i = 0; i < 5; i++ ) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("------------------------------------");;
		
		
		
	}
	
}
