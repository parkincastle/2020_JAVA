package exam02;

public class PhoneEx {

	public static void main(String[] args) {
		
//		Phone p1 = new FolderPhone(1001, "SAMSUNG", "������");
//		Phone p2 = new FolderPhone(1001, "APPLE", "��ٹ�");
//		
//		p1.turnOn();
//		p1.turnOff();
//		p2.turnOn();
//		p2.turnOff();
		
		Phone p[] = {new FolderPhone(1001, "SAMSUNG", "������"), new FolderPhone(1001, "APPLE", "��ٹ�")};
		
		for(Phone i : p) {
			i.turnOn();
			i.turnOff();
		}
		
	}

}
