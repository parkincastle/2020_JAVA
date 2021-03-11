package exam05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentEx {

	public static void main(String[] args) {

		Map<Student, Integer> map = new HashMap<>();
		map.put(new Student(1308, "���μ�"), 100);
		map.put(new Student(1303, "���μ�"), 20);
		map.put(new Student(1302, "��뿵"), 100);
		map.put(new Student(1304, "���º�"), 100);
		System.out.println("�� entry �� : " + map.size());
		System.out.println("���μ� : " + map.get(new Student(1308, "���μ�")));
		
		Set<Student> key = map.keySet();
		Iterator<Student> ki = key.iterator();
		while(ki.hasNext()) {
			Student stu = ki.next();
			System.out.print("�й� : " + stu.getNumber() + " ");
			System.out.print("�̸� : " + stu.getName() + " ");
			System.out.println("���� : " + map.get(new Student(stu.getNumber(), stu.getName())));
		}
	}

}
