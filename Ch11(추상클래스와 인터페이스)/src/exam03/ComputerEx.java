package exam03;

public class ComputerEx {

	public static void main(String[] args) {

		NoteBook noteBook = new NoteBook();
		noteBook.display();
		noteBook.typing();
		noteBook.turnon();
		noteBook.turnoff();
		
		System.out.println();
		
		Tab tab = new Tab();
		tab.display();
		tab.typing();
		tab.turnon();
		tab.turnoff();
		
//		Computer computer1 = new NoteBook();
//		Computer computer2 = new Tab();
		
		Computer[] computers = {new NoteBook(), new Tab()};
		
		for (Computer c : computers) {
			c.display();
			c.typing();
			c.turnon();
			c.turnoff();
		}
	}

}
