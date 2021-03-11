package exam03;
//블록 : { }  메인 함수블록 (메서드), 인스턴스 블록 , 정적블록(static블록)
public class BlockEx {
	
	//생성자
	public BlockEx() {
		System.out.println("기본생성자 호출됨");
		
	}
	
	//스태틱 블록 : 특징
	//기울여져 나온다(ETALIC)
	//공유메모리 상단
	
	static {
		System.out.println("정적초기화 블록 초기화");
	}
	
	// 인스턴스 블록
		{
			System.out.println("인스턴스 블록 호출됨");
		}

	//호출순서 : 정적블록 -> 인스턴스 블록 -> 생성자 호출
	public static void main(String[] args) {
		
		BlockEx b1 = new BlockEx();
		
		
		
		
	}

}
