package exam07;

public interface MyInterface {
	
	int MAX = 100;
	int MIN = 0;
	
	void method();
	
	//default 와 static은 구현부를 만들어야 한다
	default void dmethod() {
		System.out.println("interface에서 디폴트 메서드 입니다.");
	}
	
	static void smethod() {
		System.out.println("interface에서 정적 메서드 입니다.");
	}
	
	
}
