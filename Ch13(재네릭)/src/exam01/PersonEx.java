package exam01;

class Person{
	
	private Object obj;
	// Object : ��� Ŭ���� 
	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	
}

public class PersonEx {
	
	// �����׸� �ڵ� 
	public static void main(String[] args) {
		
		Person person = new Person();
		
		 //Upĳ���� : String type => Object type
		person.setObj("ȫ�浿");
		
		 // Downĳ���� : Object type => String type
		String str = (String)person.getObj();
		System.out.println(str);
		
		Person person1 = new Person();
		
		//Boxing
		person1.setObj(new Integer(100));
		int num = (Integer)person1.getObj();
		System.out.println(num);
		
		
		
		
		
	}

}
