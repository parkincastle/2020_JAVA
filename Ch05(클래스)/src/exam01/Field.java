package exam01;

// 클래스 = 멤버변수 + 멤버메서드

public class Field {
	
	//접근  방식 : public, private, protected, default
	//멤버변수
	//기본형변수 (8개)
	byte byteField;	 		//1byte
	short shortField; 		//2byte
	int intField; 			//4byte
	long longField;			//8byte
	float floatField;		//4byte
	double doubleField;		//8byte
	char charField; 		//2byte
	boolean booleanField; 	//1byte
		
	//참조형 변수 
	int[] arr;
	String str;
	
	//멤버메서드
	public void showInfo() {
		
		System.out.println("byteField : " + this.byteField);
		System.out.println(this.shortField);
		System.out.println(this.intField);
		System.out.println(this.longField);
		System.out.println(this.floatField);
		System.out.println(this.doubleField);
		System.out.println(this.charField);
		System.out.println(this.booleanField);
		
		
		
		
	}
	
	
	

}
