package exam01;

// 캐스팅 : 형 변환
// 1. 업 캐스팅 : 자식을 부모의 자료형을 갖는 것
// 2. 다운 캐스팅 : 부모를 자식의 자료형을 갖는 것

class person{
	
	String name = "홍길동";
	
	void whoami() {
		System.out.println(name + "사람이다.");
	}
	
}

class student extends person{
	
	int num = 15;
	
	void work() {
		System.out.println(num + "번이 공부한다.");
	}
	
}

public class UpcastEx {

	public static void main(String[] args) {
		
		// p, s = 주소를 저장하는 참조변수
		person p = new person();
		student s = new student();
		
		//Up 캐스팅
		p = (person)s; // p = s;와 같다
		
		//Down 캐스팅(강제로)
		s = (student)p;
		p.name = "김연아";
		p.whoami();
		((student)p).work();
		
		
		
	}

}
