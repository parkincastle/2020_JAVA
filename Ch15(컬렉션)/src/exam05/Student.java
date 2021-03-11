package exam05;

import java.util.Objects;

public class Student {

	private int number;
	private String name;
	
	public Student(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.number, this.name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student)obj;
			if(s.name.equals(this.name) && s.number == this.number) {
				return true;
		
			}
			return false;
		}
		
		return false;
	}
	
}
