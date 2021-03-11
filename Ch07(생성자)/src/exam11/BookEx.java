package exam11;

public class BookEx {

	public static void main(String[] args) {
		
		Book b = new Book();
		Book b1 = new Book("어린왕자", "생택쥐베리");
		Book b2 = new Book("춘향전", "작자미상");
		
		System.out.println(b);
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
	}
	
}
