package exam01;

import java.util.ArrayList;

public class ArrayListEx01 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		System.out.println("ũ�� : " + list.size());
		
		//��ü �߰��ϱ�
		
		//new String ("111")
		list.add("111");
		list.add("222");
		list.add("333");
		list.add("222");
		
		//new Integer(111)
		list.add(111);
	
		System.out.println("ũ�� : " + list.size());
		System.out.println("�ּ� : " + list.hashCode());
		System.out.println("����Ʈ�� �� : " + list.toString());
		
		//0��° �ε����� "333" �߰�
		list.add(0, "333");
		System.out.println("ũ�� : " + list.size());
		System.out.println("����Ʈ�� �� : " + list.toString());

		//��ü�� �����ϱ� (������ ��ü�� �ִٸ� �տ��� ���� �����ȴ�.)
		list.remove("333");
		System.out.println("����Ʈ�� �� : " + list.toString());
		System.out.println(list.remove("333"));
		System.out.println("����Ʈ�� �� : " + list.toString());
		
		//�ε��� �˻��ϱ�
		System.out.println("�ε��� : " + list.indexOf("333") + "��° ��");
		
		//��ü ��ü �����ϱ�
//		list.clear();
		for(int i = list.size()-1; i >= 0 ; i--) {
			list.remove(i);
		}
		System.out.println("����Ʈ�� �� : " + list.toString());

		
		
		
		
	}

}
