package exam01;

import java.util.Arrays;
import java.util.List;

public class ArrayListEx03 {

	public static void main(String[] args) {

		//Arrays.aslist() : �迭�������� ����
		List<String> list1 = Arrays.asList("ȫ�浿", "�迬��", "�����");
		//list1.add("�ڳ���"); //add, remove �Ұ�, �迭�� ���� ����Ͼ��Ѵ�.
		System.out.println(list1);
		list1.sort(null);
		String[] arr = (String[]) list1.toArray();
		for(int i = 0; i < arr.length;  i++) {
			System.out.println(arr[i]);
		}
		
		//����
		arr[0] = null;
		
		
		
	}

}
