package exam01;

public class InstanceOfEx {

	public static void main(String[] args) {
		
		//p, st = 인스턴스(객체의 복사본)
		person p = new person();
		student st = new student();
		
		//instanceof = 해당 클래스이거나 자식클래스일때 true
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
			System.out.println("downcast 가능");
		}
	}
	
}
