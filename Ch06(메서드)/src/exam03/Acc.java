package exam03;

//�޼��� �����ε�
	// >>���� �Լ��� �̸��� ���� �� �����ε� �� �� ����.
	//<Ʋ���� �Ǵ°� >
	//1. ������ Ÿ��
	//2. �������� ����
	//3. ����
	//*��ȯ (����)Ÿ���� �ٸ� ���� �����ε� X
public class Acc {
	
	public void add(int x, int y) {
		System.out.println(x+y);
	}
	
	public void add(double x, double y) {
		System.out.println(x+y);
	}
	
	public void add(int x, double y) {
		System.out.println(x+y);
	}
	
	public void add(int x, int y, int z) {
		System.out.println(x+y+z);
	}
	
	public void add(int[] arr) {
		int sum = 0;
		for(int i : arr) {
			sum += i;
		}
		System.out.println(sum);
	}
}
