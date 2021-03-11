package exam01;

public class StudentEx {

	public static void main(String[] args) {
		
		//st1 선언 , 공간(new) , 생성자 호출 Student()
		//생성자 : 인스턴스 호출
		//기본 생성자 호출
		Student st1 = new Student();
		System.out.println(st1); //초기값
		
		//매개변수가 있는 생성자 호출
		Student st2 = new Student("홍길동", 35);
		System.out.println(st2);
		
		//매개변수가 1개가 있는 생성자 호출
		Student st3 = new Student("강감찬");
		System.out.println(st3);
		
		//매개변수 1개(age = 20)가잇는 생성자 호출
		Student st4 = new Student(20);
		System.out.println(st4);
		
		
		
	}

}
