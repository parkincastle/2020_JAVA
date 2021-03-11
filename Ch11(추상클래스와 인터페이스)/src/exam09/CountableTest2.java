package exam09;

public class CountableTest2 {

	public static void main(String[] args) {
	
		Countable2[] m = {new Bird2("뻐꾸기",15), new Bird2("독수리",2),
							new Tree2("사과나무",10), new Tree2("밤나무",7)};
		
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
