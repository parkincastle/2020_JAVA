package exam06;

public class CardEx {

	public static void main(String[] args) {
		
		//c1 = �ν��Ͻ� ����
		Card c1 = new Card();
		Card.width = 80;
		Card.height = 30;
		c1.setCom("KB");
		c1.setCol("Yellow");
		System.out.println(c1);
		Card c2 = new Card();
		Card.width = 100;
		Card.height = 50;
		c2.setCom("����");
		c2.setCol("Blue");
		System.out.println(c2);
		
		
		
		
	}

}
