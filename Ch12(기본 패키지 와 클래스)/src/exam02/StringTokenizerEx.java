package exam02;

import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {

		String str = "time is gold, no pain no gain ";
		
		// �ڸ���
		StringTokenizer s1 = new StringTokenizer(str, ", "); // ,��  ������ ������ �ڸ���.
		
		// ���� ����
		System.out.println(s1.countTokens());
		
		// ���� Token�� �մ� ���� Token�� ��´�.
		while(s1.hasMoreTokens())
			System.out.println("(" + s1.nextToken() + ")");
		
		
		
		
	}

}
