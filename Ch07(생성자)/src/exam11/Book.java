package exam11;

public class Book {

	String title;
	String author;
	
	public Book() {
		this(" ", "작자미상");
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public Book(String title) {
		this();
		this.title = title;
//		this.author = "작자미상";
	}
	
	@Override
	public String toString() {
		return this.title + " " + this.author;
	}
	
	
	
}
