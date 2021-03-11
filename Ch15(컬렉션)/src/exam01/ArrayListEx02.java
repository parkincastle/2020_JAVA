package exam01;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx02 {

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(5);// list1.add(new Integer(5)); => 자동박싱
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
		
		//subList() : 마지막 리스트를 포함하지 않고 리그트 타입으로 리턴한다.
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		print(list1,list2);
//		list2.add(6);
		
		// 포함관계
		System.out.println("포함 : " + list1.containsAll(list2));
		
		System.out.println();
		
		//삽입히기
		list2.add("b");
		list2.add("c");
		list2.add(3, "a");
		System.out.println(list2);
		
		//대체하기
		list2.set(3, "aa");
		System.out.println(list2);
		
		System.out.println(list2.contains("aa"));
		System.out.println(list2.get(2));
		print(list1, list2);
		
		//문제 : list2에서 list1에 포함되어 있는 내용 삭제 하기
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
