package exam01;

// ĳ���� : �� ��ȯ
// 1. �� ĳ���� : �ڽ��� �θ��� �ڷ����� ���� ��
// 2. �ٿ� ĳ���� : �θ� �ڽ��� �ڷ����� ���� ��

class person{
	
	String name = "ȫ�浿";
	
	void whoami() {
		System.out.println(name + "����̴�.");
	}
	
}

class student extends person{
	
	int num = 15;
	
	void work() {
		System.out.println(num + "���� �����Ѵ�.");
	}
	
}

public class UpcastEx {

	public static void main(String[] args) {
		
		// p, s = �ּҸ� �����ϴ� ��������
		person p = new person();
		student s = new student();
		
		//Up ĳ����
		p = (person)s; // p = s;�� ����
		
		//Down ĳ����(������)
		s = (student)p;
		p.name = "�迬��";
		p.whoami();
		((student)p).work();
		
		
		
	}

}
