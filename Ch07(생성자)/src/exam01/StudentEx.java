package exam01;

public class StudentEx {

	public static void main(String[] args) {
		
		//st1 ���� , ����(new) , ������ ȣ�� Student()
		//������ : �ν��Ͻ� ȣ��
		//�⺻ ������ ȣ��
		Student st1 = new Student();
		System.out.println(st1); //�ʱⰪ
		
		//�Ű������� �ִ� ������ ȣ��
		Student st2 = new Student("ȫ�浿", 35);
		System.out.println(st2);
		
		//�Ű������� 1���� �ִ� ������ ȣ��
		Student st3 = new Student("������");
		System.out.println(st3);
		
		//�Ű����� 1��(age = 20)���մ� ������ ȣ��
		Student st4 = new Student(20);
		System.out.println(st4);
		
		
		
	}

}
