package exam04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// set : 중복 안돼고, 색인이 없다
public class HashSetEx {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		System.out.println("size : " + set.size());
		set.add("JAVA");
		set.add("PYTHON");
		set.add("C");
		set.add("JAVA"); //중복 되서 안나옴
		set.add("PYTHON"); // "
		set.add(null); // "
		set.add(null); // "
		System.out.println("size : " + set.size());
		System.out.println();
		
		//반복자 사용 출력
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
		
		//for문 출력
		for(String s : set) {
			System.out.println(s);
		}
		
		set.clear();
		
		if(set.isEmpty()) {
			System.out.println("객체가 없습니다");
		}
		else {
			System.out.println("객체가 없습니다");
		}
		
		
	}

}
