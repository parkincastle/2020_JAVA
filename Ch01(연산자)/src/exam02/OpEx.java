package exam02;

public class OpEx {

	public static void main(String[] args) {
		int a=10,b=4;
		//����������
		System.out.println("++a : " + ++a + " " + "--b  : " + --b);
		//�񱳿�����
		System.out.println(a>b);
		//��������
		System.out.println(a>b && !(a==b));
		//����Ʈ������
		System.out.println("8>>2 : " + (8>>2) + ", 8<<2 : " + (8<<2));
		//���Կ�����
		a+=b; 	System.out.println(a);
		//����ȯ������
		float c = (float)a/b;
		System.out.println(c);
		//��Ʈ������
		System.out.println((a&b) +" "+ (a|b) +" "+ (a^b));
		//���ǿ�����
		int res = (a>0)?1:-1;
		System.out.println(res);
		
	}

}
