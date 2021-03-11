package exam11;

public class Book {

	String title;
	String author;
	
	public Book() {
		this(" ", "���ڹ̻�");
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public Book(String title) {
		this();
		this.title = title;
//		this.author = "���ڹ̻�";
	}
	
	@Override
	public String toString() {
		return this.title + " " + this.author;
	}
	
	
	
}
