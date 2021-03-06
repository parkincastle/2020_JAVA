package exam4;

class Person<T>{
	
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
	
}

class Utill {
	
	//제네릭 메서드
	// : 매개변수로 T 타입을 받아서, Person T타입으로 리턴 해준다
	public static<T> Person<T> change(T t) {
		Person<T> person = new Person<>();
		person.setT(t);
		return person;
	}
	
}

public class PersonEx {

	public static void main(String[] args) {
		
		Person<String> p1 = Utill.change("홍길동");
		String str = p1.getT();
		System.out.println(str);
		
		Person<Integer> p2 = Utill.change(new Integer(100));
		Integer num = p2.getT();
		int n = num;
		System.out.println(n);
		
	}
	
}
