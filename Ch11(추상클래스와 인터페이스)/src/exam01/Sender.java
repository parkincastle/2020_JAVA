package exam01;
// �߻�Ŭ������ : �� ���̻��� �߻� �޼��带 �����ϴ� Ŭ����
// �߻�Ŭ������ �ν��Ͻ��� �����Ҽ� ����.
// �߻�޼���� ����κи� �ְ� �����ΰ� ����.

public abstract class Sender {

	private String title;
	private String name;
	
	public Sender(String title, String name) {
		super();
		this.title = title;
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public String getName() {
		return name;
	}
	
	//�߻� �޼���
	public abstract void sendMassage(String receipent); // �����
	//�߻�޼���� �ݵ�� ����� ���ؼ� ������ �ؾ��Ѵ�.
	
	
}
