package exam1;

public class StringEx01 {
	public static void main(String[] args) {
		
		String s1 = new String("Hello World");
		String s2 = new String("Hello World");
		
		System.out.println(s1==s2);
		
		//���ͷ�
		String s3 = ("Hello World");
		String s4 = ("Hello World");
		
		System.out.println(s3==s4);
		
		System.out.println(s1==s3);
		
		s1 = s3;
		System.out.println(s1==s3);
		
		//���� �� : equals();
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals("hello world"));
		
		//s1.equalsIgnoreCase() : ��ҹ��� ��� x
		System.out.println(s1.equalsIgnoreCase("hello world"));
		
		String s5 = s1.toLowerCase();
		System.out.println(s5);
		s5=s5.toUpperCase();
		System.out.println(s5);
		
		//s5.length : ���ڿ� ����
		System.out.println(s5.length());
		
		//s5.charAt(6) : �ش繮�ڸ� ���
		System.out.println(s5.charAt(6));
		
		//s5.substring(1, 4) : 
		System.out.println(s5.substring(1, 4));
		
		System.out.println(s5.length()+10+20);
		
		
		System.out.println(s5.substring(1, 4) + (10 + 20));
		
		
		
	}
	
}
