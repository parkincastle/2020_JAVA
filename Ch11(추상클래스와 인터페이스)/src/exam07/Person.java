package exam07;

public class Person implements MyInterface{

	@Override
	public void method() {
		System.out.println("PersonŬ������ �޼��� �Դϴ�.");
	}
	
	@Override
	public void dmethod() {
		MyInterface.super.dmethod();
	}
	
	
	
}
