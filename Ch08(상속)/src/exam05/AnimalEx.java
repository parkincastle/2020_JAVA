package exam05;

class Animal extends Object {

	String name;

	public Animal() {
		System.out.println("�θ��� �⺻������");
	}

	public Animal(String s) {
		this.name = s;
	}

	public void show() {
		System.out.println("�����̴�.");
	}
}

class Mammel extends Animal {

	public Mammel() {
		//super("tiger");
		super();
		System.out.println("�ڽ��� �⺻������");
	}

	//�ڽ��� �����ڴ� �θ��� �����ڸ� ���� ȣ���Ѵ�.
	public Mammel(String s) {
		//super();
		super(s);
		this.name = s;
		System.out.println("�ڽ��� �Ű����� 1�� ¥�� ������");

	}

	@Override
	public void show() {
		System.out.println(this.name + "��������.");
	}
}

public class AnimalEx {

	public static void main(String[] args) {

		Animal a1 = new Animal();
		a1.show();
		
		// ��ӹ��� ���� ������ ȣ�� = �θ� ������ ȣ��
		Mammel m1 = new Mammel();
		m1.show();
		
		Mammel m2 = new Mammel("Lion");
		m2.show();

	}

}
