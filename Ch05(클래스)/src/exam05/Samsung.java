package exam05;

public class Samsung {
	
	private String com;
	private String mod;
	private int year;
	
	
	public String getCom() {
		return com;
	}
	
	public void setCom(String com) {
		if(!com.equals("�Ｚ")) {
			System.out.println("ȸ��� ����");
			return;
		}
		this.com = com;
	}
	
	
	public String getMod() {
		return mod;
	}
	
	public void setMod(String mod) {
		this.mod = mod;
	}
	
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "ȸ�� : " + getCom() + 
				"�� : " + getMod() + 
				"�����⵵ : " + getYear();
	}
	
	

}
