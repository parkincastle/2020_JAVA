package exam06;

public class Card {

	//������� : class����
	private String com;
	private String col;
	//������� : static����(�������� : ����)
	//����ƽ���� : class��.����
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
		
		return "ȸ�� : " + getCom() + 
				"���� : " + getCol()+
				"ũ�� : " + Card.width + 
				"," + Card.height;
		
	}
	
	
	
}
