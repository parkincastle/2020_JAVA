package exam04;

// 인터페이스 : 추상클래스의 일종이다.

// 인터페이스의 멤버변수  
// 1. 상수
// 2. 추상 메서드
// 3. 정적 메서드(스태틱)
// 4. default 메서드

// 인터페이스는 인스턴스 만들수 없지만 , 상속(다중상속)가능 하다.

public interface A {

	//상수 : 값을 변경 할 수 없다.
	static final int MAX = 10;
	//static final은 생략가능
	
	//추상메서드 : public abstract 생략가능
	public abstract void method();
	
}
