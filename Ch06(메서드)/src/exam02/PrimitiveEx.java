package exam02;

public class PrimitiveEx {

	public static void main(String[] args) {
		
		Data d = new Data();
		d.data = 100;
		System.out.println("호출 전 : " + d.data);
		PrimitiveEx.Datachange(d.data);
		System.out.println("호출 후 : " + d.data);


	}
	public static void Datachange(int data) {
		data = 50;
		System.out.println(data);
	}
	
}
