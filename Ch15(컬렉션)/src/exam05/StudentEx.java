package exam05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentEx {

	public static void main(String[] args) {

		Map<Student, Integer> map = new HashMap<>();
		map.put(new Student(1308, "박인성"), 100);
		map.put(new Student(1303, "강인선"), 20);
		map.put(new Student(1302, "김대영"), 100);
		map.put(new Student(1304, "김태빈"), 100);
		System.out.println("총 entry 수 : " + map.size());
		System.out.println("박인성 : " + map.get(new Student(1308, "박인성")));
		
		Set<Student> key = map.keySet();
		Iterator<Student> ki = key.iterator();
		while(ki.hasNext()) {
			Student stu = ki.next();
			System.out.print("학번 : " + stu.getNumber() + " ");
			System.out.print("이름 : " + stu.getName() + " ");
			System.out.println("점수 : " + map.get(new Student(stu.getNumber(), stu.getName())));
		}
	}

}
