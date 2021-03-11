package exam05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// HashMap = Python�� ��ųʸ�, Interface
// Map : �ߺ��� Ű�� �������� �ʴ´�.
public class HashMapEx {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		System.out.println("������ : " + map.size());
		map.put("���μ�", 280);
		map.put("��뿵", 360);
		map.put("�����", 250);
		map.put("���μ�", 275);
		map.put("�뿬��", 240);
		System.out.println("������ : " + map.size());
		// �ߺ� ������ �� ���, �������� �߰� ����� ���� ������ ����.
		System.out.println("���μ� : " + map.get("���μ�"));
		System.out.println("���μ� : " + map.get("���μ�"));
		
		// map �÷��ǿ� �ִ� Key���� set���� �ٲ�
		Set<String> set = map.keySet();
		System.out.println("keysSet�� �̿��Ͽ� ����ϱ�");
		
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String s = iterator.next();
			int value = map.get(s);
			System.out.println(s + " : " + value);
		}
		
		System.out.println("=================================");
		
//		Set<Map.Entry<String, Integer>> s = map.entrySet();
//		Iterator<Map.Entry<String, Value>> is = entry
		
		map.clear();
		System.out.println("������ : " + map.size());

		
	}

}
