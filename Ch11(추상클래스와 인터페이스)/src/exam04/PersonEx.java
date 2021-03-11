package exam04;

public class PersonEx {

	public static void main(String[] args) {
//		
//		Person person = new Person();
//		person.method();
//		person.method2();
//		
//		Member member = new Member();
//		member.method();
//		member.method2();
		
//		A a = new Member();
		A[] a = {new Member(), new Person()};
		for(A i : a) {
//			((Member)i).method2();
			if(i instanceof Member) {
				((Member)i).method2();
				System.out.println();
			
			}
			else if(i instanceof Person) {
				((Person)i).method2();
				System.out.println();
			}
		}
		
	}

}
