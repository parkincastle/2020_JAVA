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
		
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("주소 입력 : ");
		String add = sc.next();
		System.out.print("전화번호 입력 : ");
		String hp = sc.next();
		
		if(map.get(name) != null || map.get(add) != null && map.get(hp) != null) {
			System.out.println("중복된 고객입니다");
			return;
		}
		
		///해쉬 맵에 저장
		map.put(name, new Phone(name, add, hp));
		System.out.println(name + "고객님이 등록이 되었습니다.");
		System.out.println("===================================");
	}
	
	public void delete() {
		
		System.out.print("삭제할 이름 입력 : ");
		String name = sc.next();
		
		Phone p = map.remove(name);
		
		if(p != null) {
		System.out.println(name + "고객님이 삭제되었습니다");
		}
		else {
			System.out.println("등록되지 않은 고객입니다.");
		}
		System.out.println("===================================");
	}
	
	public void  search() {
		
		System.out.print("이름 입력 : ");
		String name = sc.next();
		
		Phone p = map.get(name);

		if(p != null) {
			System.out.println(p.toString());
		}
		else {
			System.out.println("등록 되지 않은 고객입니다.");
		}
		
		System.out.println("===================================");
	}
	
	public void ShowAll() {
		
		Set<String> set = map.keySet();
		Iterator<String> iterator = set.iterator();
		System.out.println("고객 정보 전체보기");
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			Phone value = map.get(key);
			System.out.println(value.toString());
			System.out.println("===============================");
		}
	}
	
	//여기에다 코드를 침
	public void run() {
		System.out.println("고객 정보 관리 프로그램");
		System.out.println("===================================");
		while(true) {
			System.out.print("1.입력, 2.삭제, 3.검색, 4.전체보기, 5.종료  >>");
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
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("다시 입력하세요");
				continue;
			}
		}
	}
	
}
