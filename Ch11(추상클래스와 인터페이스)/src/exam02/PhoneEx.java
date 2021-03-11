package exam02;

public class PhoneEx {

	public static void main(String[] args) {
		
//		Phone p1 = new FolderPhone(1001, "SAMSUNG", "송유현");
//		Phone p2 = new FolderPhone(1001, "APPLE", "백다미");
//		
//		p1.turnOn();
//		p1.turnOff();
//		p2.turnOn();
//		p2.turnOff();
		
		Phone p[] = {new FolderPhone(1001, "SAMSUNG", "송유현"), new FolderPhone(1001, "APPLE", "백다미")};
		
		for(Phone i : p) {
			i.turnOn();
			i.turnOff();
		}
		
	}

}
