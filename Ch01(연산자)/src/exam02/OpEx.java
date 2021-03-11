package exam02;

public class OpEx {

	public static void main(String[] args) {
		int a=10,b=4;
		//증감연산자
		System.out.println("++a : " + ++a + " " + "--b  : " + --b);
		//비교연산자
		System.out.println(a>b);
		//논리연산자
		System.out.println(a>b && !(a==b));
		//시프트연산자
		System.out.println("8>>2 : " + (8>>2) + ", 8<<2 : " + (8<<2));
		//대입연산자
		a+=b; 	System.out.println(a);
		//형변환연산자
		float c = (float)a/b;
		System.out.println(c);
		//비트연산자
		System.out.println((a&b) +" "+ (a|b) +" "+ (a^b));
		//조건연산자
		int res = (a>0)?1:-1;
		System.out.println(res);
		
	}

}
