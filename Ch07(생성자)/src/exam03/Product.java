package exam03;

public class Product {

	//�������� (default)
	static int num;
	int cnt;
	
	
	//�⺻������
	public Product() {
		System.out.println("�⺻������ ȣ���");
	}
	
	//�ν��Ͻ� ��� ȣ���
	{
		System.out.println("�ν��Ͻ� ��� ȣ���");
		cnt++;
		num++;
	}
	
	static {
		System.out.println("����ƽ ��� ȣ���");
	}
	
}
