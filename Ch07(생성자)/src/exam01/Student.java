package exam01;

public class Student {

	//�������  : �̸� , ����(private)
	private String name;
	private int age;
	
	//������ : �ν��Ͻ� �ʱ�ȭ �޼���(�� ����)
	//�����ڴ� ����Ÿ���� ���� �޼��� , Ŭ�������  == �����ڸ�
	//�⺻ ������ : �����Ϸ��� �ڵ����� �����.
	//�Ű����� �ִ� �����ڰ� �� �� �� �ִٸ� �ڵ����� , �����ϴ� �ڵ����� �⺻�����ڸ� ������
	//�ʴ´�.
	//this()�Լ��� ȣ���� ���� �� ó�����忡 ����� 
	public Student() {	
		this("���", 33);
	}
	
	//�Ű������� 2���ִ� ������ : ���� �������Ѵ�.
	public Student (String name, int age) {
		System.out.println("�Ű������� �ִ� ������ ȣ��");
		this.name = name;
		this.age = age;
	}
	
	//�Ű������� 1��(name)�� �ִ� ������
	public Student (String name) {
		this(name , 55);
	}
	
	//�Ű����� 1��(age)�� �ִ� ������
	public Student (int age) {
		System.out.println("�Ű����� age�� �ִ� ������");
	}
	
	//��� �޼���
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	//ToString() �ּ���� , �� ���¸� ����� ��������̺�
	@Override
	public String toString() {
		return getName() + " : " + getAge();
	}
	
	
}
