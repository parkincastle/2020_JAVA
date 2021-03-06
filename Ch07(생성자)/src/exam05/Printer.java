package exam05;
//프린터에 대한 설계도
public class Printer {

	//클래스 : 객체에대한 속성(필드, 멤버변수), 동작(메서드)
	//멤버변수 : paper(int)
	private int paper; //프린터에 남아있는 종이의 개수
	boolean duplex; //양면 : true, 단면 : faulse
	
	//생성자 : 리턴타임니 없는 메서드, 이름 == 클래스이름
	//디폴트생성자 : 컴파일러가 자동생성
	public Printer() {
		System.out.println("기본생성자 호출");
	}
	
	public Printer(int paper, boolean duplex) {
		this.paper = paper;
		this.duplex = duplex;
	}
	
	public int getPaper() {
		return paper;
	}

	public void setPaper(int paper) {
		this.paper = paper;
	}
	
	

	public void print(int cnt, boolean duplex) {
		if(duplex) {	//duplex ==  true
			if(cnt%2==0) { //짝수 (양면으로만 출력)
				cnt /= 2;
			}
			else { // 양면, 단면 출력
				cnt = cnt / 2 + 1;
			}
		}
		
		if(this.paper == 0) {
			System.out.println("용지없음");
		}
		else if(this.paper < cnt) {
			System.out.println("출력요구" + cnt + "장 요구");
			System.out.println(this.paper + "장 만 출력");
			System.out.println(cnt - this.paper + "장 출력불가" );
			this.paper = 0;
		}
		else {
		System.out.println(this.paper + "장 있음");
		System.out.println(cnt + "장 출력됨");
		this.paper -= cnt;
		System.out.println(this.paper + "장 있음");
		}
	}
	
}
