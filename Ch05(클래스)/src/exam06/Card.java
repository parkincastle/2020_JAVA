package exam06;

public class Card {

	//멤버변수 : class변수
	private String com;
	private String col;
	//멤버변수 : static변수(정적변수 : 공유)
	//스태틱접근 : class명.변수
	static int width;
	static int height;
	
	public String getCom() {
		return com;
	}
	
	public void setCom(String com) {
		this.com = com;
	}
	
	
	public String getCol() {
		return col;
	}
	
	public void setCol(String col) {
		this.col = col;
	}
	
	@Override
	public String toString() {
		
		return "회사 : " + getCom() + 
				"색깔 : " + getCol()+
				"크기 : " + Card.width + 
				"," + Card.height;
		
	}
	
	
	
}
