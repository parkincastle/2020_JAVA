package exam2;

class Fruit{
	
	@Override
	public String toString() {
		return "사과";
	}
	
}

class Person<T>{
	
	 private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	 
	 
	
}

public class PersonEx{

	public static void main(String[] args) {
		//Person 제네릭 클래스에 데이터 타입 : T , 무조건 String만 들어오게 하기
		
		Person<String> person1 = new Person<>();
		person1.setT("박희라");
		String str = person1.getT();
		System.out.println(str);

		Person<Double> person2 = new Person<>();
		//person2.setT(new Double(3.14));
		//자동 Boxing
		person2.setT(3.14);
//		Double d = person2.getT();
//		double dd = d;
		double d = person2.getT(); // 자동 UnBoxing
		System.out.println(d);
		
		Person<Fruit> person3 = new Person<>();
		person3.setT(new Fruit());
		Fruit f = person3.getT(); // 자동 UnBoxing
		System.out.println(f);
		
		
	}
	
}
