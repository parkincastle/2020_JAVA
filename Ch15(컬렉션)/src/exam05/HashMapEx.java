package exam05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// HashMap = Python의 딕셔너리, Interface
// Map : 중복된 키를 저장하지 않는다.
public class HashMapEx {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		System.out.println("사이즈 : " + map.size());
		map.put("박인성", 280);
		map.put("김대영", 360);
		map.put("김민지", 250);
		map.put("박인성", 275);
		map.put("노연주", 240);
		System.out.println("사이즈 : " + map.size());
		// 중복 저장이 될 경우, 마지막에 추가 저장된 값이 가져와 진다.
		System.out.println("박인성 : " + map.get("박인성"));
		System.out.println("강인선 : " + map.get("강인선"));
		
		// map 컬렉션에 있는 Key값을 set으로 바꿈
		Set<String> set = map.keySet();
		System.out.println("keysSet을 이용하여 출력하기");
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String s = iterator.next();
			int value = map.get(s);
			System.out.println(s + " : " + value);
		}
		
		System.out.println("=================================");
		
//		Set<Map.Entry<String, Integer>> s = map.entrySet();
//		Iterator<Map.Entry<String, Value>> is = entry
		
		map.clear();
		System.out.println("사이즈 : " + map.size());

		
	}

}
