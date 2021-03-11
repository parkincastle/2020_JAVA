package exam07;

public class Line {
	
	int length;

	public Line(int length) {
		this.length = length;
	}
	
	public void isSameLine(Line b) {
		if(this.length == b.length) {
			System.out.println("같습니다");
		}
		else {
			System.out.println("다릅니다");
		}
		
	}
	
}
