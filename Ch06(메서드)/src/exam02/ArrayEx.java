package exam02;

public class ArrayEx {

	public static void main(String[] args) {
		
		int[] arr = new int[] {1, 2, 3, 4, 5};
		System.out.println("ȣ�� �� : " + arr[0]);
		ArrayEx.Change(arr);
		System.out.println("ȣ�� �� : " + arr[0]);

		
	}
	public static void Change(int[] arr) {
		arr[0] = 99;
		System.out.println("�Լ� �� : " + arr[0]);
	}
}
