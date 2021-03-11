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
		System.out.println("사람[" + "이름 : " + this.name + " 나이 : " + this.age + "]");
	}

}



class Student extends Person{
	
	int num;
	
	public Student(String name, int age, int num) {
		super(name,age);
		this.num = num;
		
	}
	
	void show() {
		System.out.println("학생[" + "이름 : " + this.name + " 나이 : " + this.age  + " 학번 : " + this.num + "]");
	}
	
}

class ForignStudent extends Student{
	
	String from;
	
	public ForignStudent(String name, int age, int num, String from) {
		super(name, age, num);
		this.from = from;
		
	}
	
	void show() {
		System.out.println("외국학생[" + "이름 : " + this.name + " 나이 : " + this.age  + " 학번 : " + this.num +" 국적 : " + this.from + "]");
	}
	
}

public class PersonEx {
	
	
	
	public static void main(String[] args) {
		
		Person[] pp = new Person[] {
				new Person("길동이",22), new Student("황진이", 23, 100), new ForignStudent("Amy", 30, 200, "U.S.A")
		};
		
//		pp[0].show();
//		for (int i = 1; i < pp.length; i++) {
//			pp[i].show();
//		}
		
		//개선된 for문
		for(Person i : pp) {
			// i = p[i++];
			i.show();
		}
		
		
//		Person p = new Person("길동이",22)	;
//		p.show();
//		
//		Person s = new Student("황진이", 23, 100);
//		s.show();
//		
//		Person f = new ForignStudent("Amy", 30, 200, "U.S.A");
//		f.show();

	}

}
