package exam12;
// �� ���� ���Ͽ��� public class�� 1���� �־���Ѵ�.
// public class�� �̸��� ���� �̸��� ����.
class TV {
	
	int size;
	String model;
	
	public TV() {
		this.size = 32;
		this.model = "LG";
	}
	
	public TV(String model) {
		this();
		this.model = model;
	}
	
	public TV(int size, String model) {
		this.size = size;
		this.model = model;
	}
	
	
	@Override
	public String toString() {
		return size + "��ġ " + model;
	}
}

public class TVEx {

	public static void main(String[] args) {
		
		TV tv1 = new TV();
		TV tv2 = new TV("SAMSUNG");
		TV tv3 = new TV(45, "LG");
		System.out.println(tv1);
		System.out.println(tv2);
		System.out.println(tv3);
	}

}
