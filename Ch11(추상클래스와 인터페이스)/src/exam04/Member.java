package exam04;

public class Member implements A{

	@Override
	public void method() {
		System.out.println("인터페이스 A를 구현한 메서드");
	}
	
	public void method2() {
		System.out.println("멤버 클래스 안에 있는 메서드");
	}

	
	
}
