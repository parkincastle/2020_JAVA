package exam01;

import java.util.Arrays;
import java.util.List;

public class ArrayListEx03 {

	public static void main(String[] args) {

		//Arrays.aslist() : 배열형식으로 리턴
		List<String> list1 = Arrays.asList("홍길동", "김연아", "손흥민");
		//list1.add("박나래"); //add, remove 불가, 배열을 만들어서 사용하야한다.
		System.out.println(list1);
		list1.sort(null);
		String[] arr = (String[]) list1.toArray();
		for(int i = 0; i < arr.length;  i++) {
			System.out.println(arr[i]);
		}
		
		//삭제
		arr[0] = null;
		
		
		
	}

}
