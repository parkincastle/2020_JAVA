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
		
		//생성자 아용한 방법
		Object[] dd = {2020, 11, 12};
		MessageFormat m1 = new MessageFormat("년도 : {0} 월 : {0} 일 : {2}");
		System.out.println();
		
		String s = MessageFormat.format("년도 : {0} 월 {1} 일{2}", "2020", "11", "12");
		System.out.println(s);
		
		String s2 = MessageFormat.format("날짜 : {0} 작성자 : {1}", s1.format(d), "홍길동");
		System.out.println(s2);
		
		
	}

}
