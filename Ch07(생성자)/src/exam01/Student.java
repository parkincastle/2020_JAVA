package exam01;

public class Student {

	//멤버변수  : 이름 , 나이(private)
	private String name;
	private int age;
	
	//생성자 : 인스턴스 초기화 메서드(값 세팅)
	//생성자는 리턴타입이 없는 메서드 , 클래스명과  == 생성자명
	//기본 생성자 : 컴파일러가 자동으로 만든다.
	//매개변수 있는 생성자가 한 개 라도 있다면 자동으로 , 컴파일는 자동으로 기본생성자를 만들지
	//않는다.
	//this()함수를 호출할 때는 맨 처음문장에 적어라 
	public Student() {	
		this("놀부", 33);
	}
	
	//매개변수가 2개있는 생성자 : 내가 만들어야한다.
	public Student (String name, int age) {
		System.out.println("매개변수가 있는 생성자 호출");
		this.name = name;
		this.age = age;
	}
	
	//매개변수가 1개(name)가 있는 생성자
	public Student (String name) {
		this(name , 55);
	}
	
	//매개변수 1개(age)가 있는 생성자
	public Student (int age) {
		System.out.println("매개변수 age가 있는 생성자");
	}
	
	//멤버 메서드
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	//ToString() 주소출력 , 내 상태를 보기로 오버드라이브
	@Override
	public String toString() {
		return getName() + " : " + getAge();
	}
	
	
}
