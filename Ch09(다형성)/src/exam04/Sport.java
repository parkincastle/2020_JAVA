package exam04;

class Baseball extends Sport {

	int player = 9;

	@Override
	public void rule(String name) {
		System.out.println("������� : " + getName());
		System.out.println("�÷��̾� : " + this.player);
		System.out.println("����Ģ : �߱��� ��Ģ�� ����");

	}

}

class PingPong extends Sport {

	String team = "����";

	@Override
	public void rule(String name) {
		System.out.println("������� : " + getName());
		System.out.println("����� : " + this.team);
		System.out.println("����Ģ : Ź���� ��Ģ�� ����");
	}

}

public class Sport {

	private String name;

	public String getName() {
		return name;
	}

	public void rule(String name) {
		System.out.println("����Ģ : �� ��� ��Ģ�� ����");
	}

	public static void main(String[] args) {

		Sport s1 = new Baseball();
		s1.rule("BaseBall");
		
		Sport s2 = new PingPong();
		s2.rule("PingPong");
	}

}
