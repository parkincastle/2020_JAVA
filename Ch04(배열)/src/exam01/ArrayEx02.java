package exam01;

import java.util.Arrays;

public class ArrayEx02 {

	public static void main(String[] args) {

		int[] arr = new int[] { 10, 200, 34, 42, 50 }; // �迭 ����� ���ÿ� �ʱ�ȭ

		//��¹�� 1 : for���̿�
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i+" ");
		}
		System.out.println();
		
		
		//��¹�� 2 : ������ for���̿�
		//for(����Ŀ Ÿ�Ժ��� : �迭)
		for(int i : arr) {
			System.out.println(i + " ");
		}
		System.out.println();
		
		
		//��¹�� 3 : Array Ŭ���� �̿�
		System.out.println(Arrays.toString(arr));
		
		
	}

}
