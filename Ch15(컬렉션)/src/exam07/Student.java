package exam07;

public class Student {

	private String name;
	private String department;
	private String num;
	private String score;
	
	public Student(String name, String department, String num, String score) {
		super();
		this.name = name;
		this.department = department;
		this.num = num;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}

	public String getDepartment() {
		return department;
	}

	public String getNum() {
		return num;
	}

	public String getScore() {
		return score;
	}

	@Override
	public String toString() {
		return "이름 : " + this.name + "\n주소 : " + this.department + "\n학번 : " + this.num + "\n점수 : " + this.score;
	}
	
}
