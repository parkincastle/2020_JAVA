package exam11;

public class BookEx {

	public static void main(String[] args) {
		
		Book b = new Book();
		Book b1 = new Book("�����", "�����㺣��");
		Book b2 = new Book("������", "���ڹ̻�");
		
		System.out.println(b);
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		
	}
	
}
