package exam02;

public class StringEx {

	public static void main(String[] args) {
		
		//�⺻���� (8��) ; ������, ��������  : �ּ� (new������)
		//Scanner sc; = ��������
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println(str1);
		System.out.println(str2);
		if(str1 == str2) {
			System.out.println("����");
		}
		else {
			System.out.println("�ٸ���");
		}
		if(str1.equals(str2)) {
			System.out.println("����");
		}
		else {
			System.out.println("�ٸ���");
		}
		
	}
	
}
