package exam05;

public class Samsung {
	
	private String com;
	private String mod;
	private int year;
	
	
	public String getCom() {
		return com;
	}
	
	public void setCom(String com) {
		if(!com.equals("삼성")) {
			System.out.println("회사명 에러");
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
		return "회사 : " + getCom() + 
				"모델 : " + getMod() + 
				"제조년도 : " + getYear();
	}
	
	

}
