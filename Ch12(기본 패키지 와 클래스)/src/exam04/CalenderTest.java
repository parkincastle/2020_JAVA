package exam04;

import java.util.Calendar;

public class CalenderTest {

	public static void main(String[] args) {

		String[] weekName = {"��", "��", "ȭ", "��", "��", "��", "��"};
		String[] noonName = {"����", "����"};
		Calendar c = Calendar.getInstance();
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		String week = weekName[c.get(Calendar.DAY_OF_WEEK)];
		String noon = noonName[c.get(Calendar.AM_PM)];
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		
		System.out.println(year + "��" + month + "��" + day + "��");
		System.out.println(week + "����" + noon);
		System.out.println(hour + "��" + minute + "��" + second + "��");
		
		
	}

}
