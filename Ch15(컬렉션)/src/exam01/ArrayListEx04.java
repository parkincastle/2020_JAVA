package exam01;

import java.util.Arrays;
import java.util.List;

public class ArrayListEx04 {

	public static void main(String[] args) {

		String[] names = {"�罿", "ȣ����", "�ٴ�ǥ��", "��"};
		System.out.println(Arrays.toString(names));
		
		List<String> list = Arrays.asList(names);// aslist = �迭�� ����Ʈ�� ����
		System.out.println(list);
		
		list.set(2, "ǥ��");
		list.sort(null);
		System.out.println(list);
		
		String[] name2 = list.toArray(new String[list.size()]);// toArray = ����Ʈ�� �迭�� ����
		System.out.println(Arrays.toString(name2));
		
		
	}

}
