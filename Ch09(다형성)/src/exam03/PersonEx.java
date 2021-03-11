package exam03;
class Person{
	
	int age;
	String name;
	
	public Person(String name, int age) {
		super();
		this.age = age;
		this.name = name;
	}
	
	void show() {
		System.out.println("���[" + "�̸� : " + this.name + " ���� : " + this.age + "]");
	}

}



class Student extends Person{
	
	int num;
	
	public Student(String name, int age, int num) {
		super(name,age);
		this.num = num;
		
	}
	
	void show() {
		System.out.println("�л�[" + "�̸� : " + this.name + " ���� : " + this.age  + " �й� : " + this.num + "]");
	}
	
}

class ForignStudent extends Student{
	
	String from;
	
	public ForignStudent(String name, int age, int num, String from) {
		super(name, age, num);
		this.from = from;
		
	}
	
	void show() {
		System.out.println("�ܱ��л�[" + "�̸� : " + this.name + " ���� : " + this.age  + " �й� : " + this.num +" ���� : " + this.from + "]");
	}
	
}

public class PersonEx {
	
	
	
	public static void main(String[] args) {
		
		Person[] pp = new Person[] {
				new Person("�浿��",22), new Student("Ȳ����", 23, 100), new ForignStudent("Amy", 30, 200, "U.S.A")
		};
		
//		pp[0].show();
//		for (int i = 1; i < pp.length; i++) {
//			pp[i].show();
//		}
		
		//������ for��
		for(Person i : pp) {
			// i = p[i++];
			i.show();
		}
		
		
//		Person p = new Person("�浿��",22)	;
//		p.show();
//		
//		Person s = new Student("Ȳ����", 23, 100);
//		s.show();
//		
//		Person f = new ForignStudent("Amy", 30, 200, "U.S.A");
//		f.show();

	}

}
