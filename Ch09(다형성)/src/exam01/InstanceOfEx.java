package exam01;

public class InstanceOfEx {

	public static void main(String[] args) {
		
		//p, st = �ν��Ͻ�(��ü�� ���纻)
		person p = new person();
		student st = new student();
		
		//instanceof = �ش� Ŭ�����̰ų� �ڽ�Ŭ�����϶� true
		System.out.println(st instanceof student);
		System.out.println(p instanceof person);
		System.out.println(st instanceof person);
		System.out.println(p instanceof student);
		System.out.println(p instanceof Object);
		
		downcast(st);

	}

	// person p = st; //upcasting
	public static void downcast(person p) {
		
		// p = (person) st
		if (p instanceof person) {
			student st = (student)p;
			System.out.println("downcast ����");
		}
	}
	
}
