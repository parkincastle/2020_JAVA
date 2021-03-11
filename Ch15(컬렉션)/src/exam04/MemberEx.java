package exam04;

import java.util.HashSet;
import java.util.Iterator;

public class MemberEx {

	public static void main(String[] args) {

		HashSet<Member> set = new HashSet<Member>();
		set.add(new Member("ȫ�浿", 30));
		set.add(new Member("ȫ�浿", 30));
		set.add(new Member("ȫ�浿", 25));
		set.add(new Member("�迬��", 25));
		
		System.out.println("�� ��ü �� : " + set.size());
		
		Iterator<Member> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			Member m = iterator.next();
			System.out.println(m.getName()+ " " + m.getAge());
		}
		
		for(Member m : set) {
			System.out.println(m.getName()+ " " + m.getAge());
		}
		
	}

}
