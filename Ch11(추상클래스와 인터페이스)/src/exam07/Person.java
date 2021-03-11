package exam07;

public class Person implements MyInterface{

	@Override
	public void method() {
		System.out.println("Person클래스의 메서드 입니다.");
	}
	
	@Override
	public void dmethod() {
		MyInterface.super.dmethod();
	}
	
	
	
}
