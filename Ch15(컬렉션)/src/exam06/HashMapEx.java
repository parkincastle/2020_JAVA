package exam06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		
		Map<String, String> dic = new HashMap<>();
		dic.put("head", "�Ӹ�");
		dic.put("teacher", "������");
		dic.put("cat", "�����");
		dic.put("aunt", "������");
		dic.put("noodle", "����");
		dic.put("child", "���");
		
		Set<String> set = dic.keySet();
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.print(str + " = " + dic.get(str) + " ");
		}
		
		for(String key : set) {
			System.out.println(key + " : " + dic.get(key));
		}
		
		System.out.println("���� �ܾ� �Է�");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		System.out.println(dic.get(str1));
		
		
	}
	
}
