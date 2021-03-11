package exam02;

public class StudentEx {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.name = "ȫ�浿";
		s1.age = 17;
		s1.showInfo();
		
		Student s2 = new Student();
		s2.showInfo();
		s2 = s1;
		s2.showInfo();    
		
		System.out.println(s1);

	}

}
