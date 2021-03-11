package exam06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		
		Map<String, String> dic = new HashMap<>();
		dic.put("head", "머리");
		dic.put("teacher", "선생님");
		dic.put("cat", "고양이");
		dic.put("aunt", "아지매");
		dic.put("noodle", "국수");
		dic.put("child", "어린이");
		
		Set<String> set = dic.keySet();
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.print(str + " = " + dic.get(str) + " ");
		}
		
		for(String key : set) {
			System.out.println(key + " : " + dic.get(key));
		}
		
		System.out.println("영어 단어 입력");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		System.out.println(dic.get(str1));
		
		
	}
	
}
