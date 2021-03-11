package exam01;

import java.util.Arrays;
import java.util.List;

public class ArrayListEx04 {

	public static void main(String[] args) {

		String[] names = {"사슴", "호랑이", "바다표범", "곰"};
		System.out.println(Arrays.toString(names));
		
		List<String> list = Arrays.asList(names);// aslist = 배열을 리스트로 변경
		System.out.println(list);
		
		list.set(2, "표범");
		list.sort(null);
		System.out.println(list);
		
		String[] name2 = list.toArray(new String[list.size()]);// toArray = 리스트를 배열로 변경
		System.out.println(Arrays.toString(name2));
		
		
	}

}
