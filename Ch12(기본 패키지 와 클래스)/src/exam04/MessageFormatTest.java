package exam04;

import java.text.MessageFormat;

public class MessageFormatTest {

	public static void main(String[] args) {

		Object[][] data = {{"�������", 1, "����"}, {"������", 2, "�̱�"}, {"¡�⽺ĭ", 3, "����"}};
//		for(Object[] o : data) {
//			String s = MessageFormat.format("�̸� : {0}\t��ȣ : {1}\t���� : {2}\t", o);
//			System.out.println(s);
//		}
		
		for(int i = 0; i < data.length; i++) {
			String s = MessageFormat.format("�̸� : {0}\t��ȣ : {1}\t���� : {2}\t", o);
			System.out.println(s);
		}
		
		
	}

}
