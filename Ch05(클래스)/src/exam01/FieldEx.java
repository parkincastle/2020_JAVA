package exam01;

//�ٸ��� : ctrl + shift + f
//���� : ctrl + alt + ����Ű
//���� ���� : ctrl + d
//�ּ� : ctrl + /

public class FieldEx {

	public static void main(String[] args) {

		//�������
		System.out.println("��������� ���ٰ��");
		Field f1 = new Field();
		System.out.println(f1.byteField);
		System.out.println(f1.shortField);
		System.out.println(f1.intField);
		System.out.println(f1.longField);
		System.out.println(f1.floatField);
		System.out.println(f1.doubleField);
//		System.out.println(f1.charField);
		System.out.println(f1.booleanField);
		System.out.println(f1.arr);
		System.out.println(f1.str);
		
		System.out.println("=====================================");
		
		// ����޼��� ����
		System.out.println();
		Field f2 = new Field();
		f2.showInfo();

	}

}
