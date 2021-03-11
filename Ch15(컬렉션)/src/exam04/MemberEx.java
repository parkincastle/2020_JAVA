package exam04;

import java.util.HashSet;
import java.util.Iterator;

public class MemberEx {

	public static void main(String[] args) {

		HashSet<Member> set = new HashSet<Member>();
		set.add(new Member("È«±æµ¿", 30));
		set.add(new Member("È«±æµ¿", 30));
		set.add(new Member("È«±æµ¿", 25));
		set.add(new Member("±è¿¬¾Æ", 25));
		
		System.out.println("ÃÑ °´Ã¼ ¼ö : " + set.size());
		
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
