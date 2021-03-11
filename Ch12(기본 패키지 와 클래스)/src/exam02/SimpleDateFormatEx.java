package exam02;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx {

	public static void main(String[] args) {

		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(s1.format(d));
		
		//������ �ƿ��� ���
		Object[] dd = {2020, 11, 12};
		MessageFormat m1 = new MessageFormat("�⵵ : {0} �� : {0} �� : {2}");
		System.out.println();
		
		String s = MessageFormat.format("�⵵ : {0} �� {1} ��{2}", "2020", "11", "12");
		System.out.println(s);
		
		String s2 = MessageFormat.format("��¥ : {0} �ۼ��� : {1}", s1.format(d), "ȫ�浿");
		System.out.println(s2);
		
		
	}

}
