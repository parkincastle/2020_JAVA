package exam04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// set : �ߺ� �ȵŰ�, ������ ����
public class HashSetEx {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		System.out.println("size : " + set.size());
		set.add("JAVA");
		set.add("PYTHON");
		set.add("C");
		set.add("JAVA"); //�ߺ� �Ǽ� �ȳ���
		set.add("PYTHON"); // "
		set.add(null); // "
		set.add(null); // "
		System.out.println("size : " + set.size());
		System.out.println();
		
		//�ݺ��� ��� ���
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
		}
		
		//for�� ���
		for(String s : set) {
			System.out.println(s);
		}
		
		set.clear();
		
		if(set.isEmpty()) {
			System.out.println("��ü�� �����ϴ�");
		}
		else {
			System.out.println("��ü�� �����ϴ�");
		}
		
		
	}

}
