package exam07;

public interface MyInterface {
	
	int MAX = 100;
	int MIN = 0;
	
	void method();
	
	//default �� static�� �����θ� ������ �Ѵ�
	default void dmethod() {
		System.out.println("interface���� ����Ʈ �޼��� �Դϴ�.");
	}
	
	static void smethod() {
		System.out.println("interface���� ���� �޼��� �Դϴ�.");
	}
	
	
}
