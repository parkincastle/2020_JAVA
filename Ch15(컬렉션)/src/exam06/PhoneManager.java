package exam06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PhoneManager {

	private Scanner sc;
	
	HashMap<String, Phone> map = new HashMap<>();
	
	public PhoneManager() {
		sc = new Scanner(System.in);
	}
	
	public void insert() {
		
		System.out.print("�̸� �Է� : ");
		String name = sc.next();
		System.out.print("�ּ� �Է� : ");
		String add = sc.next();
		System.out.print("��ȭ��ȣ �Է� : ");
		String hp = sc.next();
		
		if(map.get(name) != null || map.get(add) != null && map.get(hp) != null) {
			System.out.println("�ߺ��� ���Դϴ�");
			return;
		}
		
		///�ؽ� �ʿ� ����
		map.put(name, new Phone(name, add, hp));
		System.out.println(name + "������ ����� �Ǿ����ϴ�.");
		System.out.println("===================================");
	}
	
	public void delete() {
		
		System.out.print("������ �̸� �Է� : ");
		String name = sc.next();
		
		Phone p = map.remove(name);
		
		if(p != null) {
		System.out.println(name + "������ �����Ǿ����ϴ�");
		}
		else {
			System.out.println("��ϵ��� ���� ���Դϴ�.");
		}
		System.out.println("===================================");
	}
	
	public void  search() {
		
		System.out.print("�̸� �Է� : ");
		String name = sc.next();
		
		Phone p = map.get(name);

		if(p != null) {
			System.out.println(p.toString());
		}
		else {
			System.out.println("��� ���� ���� ���Դϴ�.");
		}
		
		System.out.println("===================================");
	}
	
	public void ShowAll() {
		
		Set<String> set = map.keySet();
		Iterator<String> iterator = set.iterator();
		System.out.println("�� ���� ��ü����");
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			Phone value = map.get(key);
			System.out.println(value.toString());
			System.out.println("===============================");
		}
	}
	
	//���⿡�� �ڵ带 ħ
	public void run() {
		System.out.println("�� ���� ���� ���α׷�");
		System.out.println("===================================");
		while(true) {
			System.out.print("1.�Է�, 2.����, 3.�˻�, 4.��ü����, 5.����  >>");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				insert();
				break;
			case 2:
				delete();
				break;
			case 3:
				search();
				break;
			case 4:
				ShowAll();
				break;
			case 5:
				System.out.println("���α׷� ����");
				return;
			default:
				System.out.println("�ٽ� �Է��ϼ���");
				continue;
			}
		}
	}
	
}
