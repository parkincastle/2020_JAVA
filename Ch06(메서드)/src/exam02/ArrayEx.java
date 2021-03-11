package exam02;

public class ArrayEx {

	public static void main(String[] args) {
		
		int[] arr = new int[] {1, 2, 3, 4, 5};
		System.out.println("호출 전 : " + arr[0]);
		ArrayEx.Change(arr);
		System.out.println("호출 후 : " + arr[0]);

		
	}
	public static void Change(int[] arr) {
		arr[0] = 99;
		System.out.println("함수 내 : " + arr[0]);
	}
}
