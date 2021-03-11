package exam09;

public class CountableTest2 {

	public static void main(String[] args) {
	
		Countable2[] m = {new Bird2("���ٱ�",15), new Bird2("������",2),
							new Tree2("�������",10), new Tree2("�㳪��",7)};
		
		for(Countable2 e : m) {
			e.count();
		}
		
		for(int i = 0; i < m.length; i++) {
			if(m[i] instanceof Bird2) {
				((Bird2)m[i]).fly();
			}
			if(m[i] instanceof Tree2) {
				((Tree2)m[i]).ripen();
			}
		}
		
	}

}
