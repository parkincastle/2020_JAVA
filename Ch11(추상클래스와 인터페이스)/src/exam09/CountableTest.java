package exam09;

public class CountableTest {

	public static void main(String[] args) {
	
		Countable[] m = {new Bird("뻐꾸기",15), new Bird("독수리",2),
							new Tree("사과나무",10), new Tree("밤나무",7)};
		
		for(Countable e : m) {
			e.count();
		}
		
		for(int i = 0; i < m.length; i++) {
			if(m[i] instanceof Bird) {
				((Bird)m[i]).fly();
			}
			if(m[i] instanceof Tree) {
				((Tree)m[i]).ripen();
			}
		}
		
	}

}
