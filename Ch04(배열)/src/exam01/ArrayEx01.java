package exam01;

public class ArrayEx01 {

	public static void main(String[] args) {
		
		int[] arr = new int[] {1,2,3,4,5}; //�迭 ����� ���ÿ� �ʱ�ȭ
		
		for(int i = 0; i < 5; i++ ) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("------------------------------------");;
		int n = arr.length;
		arr[2] = 100;//����ó�� �� ����
		for(int i = 0; i < 5; i++ ) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("------------------------------------");;
		
		
		
	}
	
}
