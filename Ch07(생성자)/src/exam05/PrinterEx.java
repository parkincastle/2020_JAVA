package exam05;
//프린터 클래스 테스트해보는 메인함수
public class PrinterEx {

	public static void main(String[] args) {
		
		//클래스를 메모리에 로드
		Printer p = new Printer(100, true);
		//프린터에 용지 100장 넣기
		//p.setPaper(100);
		//70장 출력하기
		p.print(70, true);
		p.print(50, false);
		p.print(50, true);
		
		
	}

}
