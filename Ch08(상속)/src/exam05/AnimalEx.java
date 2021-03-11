package exam05;

class Animal extends Object {

	String name;

	public Animal() {
		System.out.println("부모의 기본생성자");
	}

	public Animal(String s) {
		this.name = s;
	}

	public void show() {
		System.out.println("동물이다.");
	}
}

class Mammel extends Animal {

	public Mammel() {
		//super("tiger");
		super();
		System.out.println("자식의 기본생성자");
	}

	//자식의 생성자는 부모의 생성자를 먼저 호출한다.
	public Mammel(String s) {
		//super();
		super(s);
		this.name = s;
		System.out.println("자식의 매개변수 1개 짜리 생성자");

	}

	@Override
	public void show() {
		System.out.println(this.name + "포유류다.");
	}
}

public class AnimalEx {

	public static void main(String[] args) {

		Animal a1 = new Animal();
		a1.show();
		
		// 상속받은 것의 생성자 호출 = 부모 생성자 호출
		Mammel m1 = new Mammel();
		m1.show();
		
		Mammel m2 = new Mammel("Lion");
		m2.show();

	}

}
