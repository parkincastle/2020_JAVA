package exam01;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx02 {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(5);// list1.add(new Integer(5)); => �ڵ��ڽ�
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
		
		//subList() : ������ ����Ʈ�� �������� �ʰ� ����Ʈ Ÿ������ �����Ѵ�.
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1,list2);
//		list2.add(6);
		
		// ���԰���
		System.out.println("���� : " + list1.containsAll(list2));
		
		System.out.println();
		
		//��������
		list2.add("b");
		list2.add("c");
		list2.add(3, "a");
		System.out.println(list2);
		
		//��ü�ϱ�
		list2.set(3, "aa");
		System.out.println(list2);
		
		System.out.println(list2.contains("aa"));
		System.out.println(list2.get(2));
		print(list1, list2);
		
		//���� : list2���� list1�� ���ԵǾ� �ִ� ���� ���� �ϱ�
		for(int i = list2.size()-1; i >= 0; i--) {
			if(list2.contains(list1.get(i))) {
				list1.remove(i);
			}
		}
		
		Collections.sort(list1);
		Collections.sort(list2);
		
		print(list1, list2);

		
		
	}

	public static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
	}
}
