package exam2;

class Fruit{
	
	@Override
	public String toString() {
		return "���";
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
		//Person ���׸� Ŭ������ ������ Ÿ�� : T , ������ String�� ������ �ϱ�
		
		Person<String> person1 = new Person<>();
		person1.setT("�����");
		String str = person1.getT();
		System.out.println(str);

		Person<Double> person2 = new Person<>();
		//person2.setT(new Double(3.14));
		//�ڵ� Boxing
		person2.setT(3.14);
//		Double d = person2.getT();
//		double dd = d;
		double d = person2.getT(); // �ڵ� UnBoxing
		System.out.println(d);
		
		Person<Fruit> person3 = new Person<>();
		person3.setT(new Fruit());
		Fruit f = person3.getT(); // �ڵ� UnBoxing
		System.out.println(f);
		
		
	}
	
}
