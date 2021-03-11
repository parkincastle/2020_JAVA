package exam01;

class Person{
	
	private Object obj;
	// Object : 모든 클래스 
	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	
}

public class PersonEx {
	
	// 비제네릭 코드 
	public static void main(String[] args) {
		
		Person person = new Person();
		
		 //Up캐스팅 : String type => Object type
		person.setObj("홍길동");
		
		 // Down캐스팅 : Object type => String type
		String str = (String)person.getObj();
		System.out.println(str);
		
		Person person1 = new Person();
		
		//Boxing
		person1.setObj(new Integer(100));
		int num = (Integer)person1.getObj();
		System.out.println(num);
		
		
		
		
		
	}

}
