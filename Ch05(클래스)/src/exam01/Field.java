package exam01;

// Ŭ���� = ������� + ����޼���

public class Field {
	
	//����  ��� : public, private, protected, default
	//�������
	//�⺻������ (8��)
	byte byteField;	 		//1byte
	short shortField; 		//2byte
	int intField; 			//4byte
	long longField;			//8byte
	float floatField;		//4byte
	double doubleField;		//8byte
	char charField; 		//2byte
	boolean booleanField; 	//1byte
		
	//������ ���� 
	int[] arr;
	String str;
	
	//����޼���
	public void showInfo() {
		
		System.out.println("byteField : " + this.byteField);
		System.out.println(this.shortField);
		System.out.println(this.intField);
		System.out.println(this.longField);
		System.out.println(this.floatField);
		System.out.println(this.doubleField);
		System.out.println(this.charField);
		System.out.println(this.booleanField);
		
		
		
		
	}
	
	
	

}
