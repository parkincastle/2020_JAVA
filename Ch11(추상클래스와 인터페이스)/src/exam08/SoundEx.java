package exam08;

public class SoundEx {

	public static void main(String[] args) {
		
		//개체생성 () { /이안을 클래스 처럼 사용/ 추상객체(){}}
		//내부적으로는 클래스니까 멤버들을 선언할 수 있으나
		//외부에서 접근은 불가능 하다. 근본이 사운더블
		Soundable soundable1 = new Soundable() {
			
			int a = 100;
			
			public void method() {
				System.out.println("익명 구현 객체");
			}
			
			@Override
			public void sound(int a) {
				this.a = a;
				String str = "야옹";
				System.out.println("고양이 : " + str);
				this.method();
				System.out.println(this.a);
			}
		};
		soundable1.sound(10);
		
		Soundable soundable2 = new Soundable() {
				
				int a = 100;
				
				public void method() {
					System.out.println("익명 구현 객체");
				}
				
				@Override
				public void sound(int a) {
					this.a = a;
					String str = "멍멍";
					System.out.println("개 : " + str);
					this.method();
					System.out.println(this.a);
			}
		};
		
		soundable2.sound(10);
		
		
		
	}

}
