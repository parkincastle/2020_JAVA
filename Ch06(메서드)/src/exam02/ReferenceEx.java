package exam02;

public class ReferenceEx {

	public static void main(String[] args) {
		
		Data d = new Data();
		d.data = 100;
		System.out.println("ȣ�� �� : " + d.data);
		ReferenceEx.Datachange(d);
		System.out.println("ȣ�� �� : " + d.data);


	}
	public static void Datachange(Data d) {
		d.data = 50;
		System.out.println(d.data);
		
	}
	
}
