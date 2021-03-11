package exam01;

//줄맞춤 : ctrl + shift + f
//복사 : ctrl + alt + 방향키
//한줄 삭제 : ctrl + d
//주석 : ctrl + /

public class FieldEx {

	public static void main(String[] args) {

		//멤버변수
		System.out.println("멤버변수로 접근결과");
		Field f1 = new Field();
		System.out.println(f1.byteField);
		System.out.println(f1.shortField);
		System.out.println(f1.intField);
		System.out.println(f1.longField);
		System.out.println(f1.floatField);
		System.out.println(f1.doubleField);
//		System.out.println(f1.charField);
		System.out.println(f1.booleanField);
		System.out.println(f1.arr);
		System.out.println(f1.str);
		
		System.out.println("=====================================");
		
		// 멤버메서드 접근
		System.out.println();
		Field f2 = new Field();
		f2.showInfo();

	}

}
