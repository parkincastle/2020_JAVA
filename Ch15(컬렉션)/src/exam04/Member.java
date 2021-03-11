package exam04;

import java.util.Objects;

public class Member {

	private String name;
	private int age;
	
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	//논리적 동등 객체의 조건  : 1. HashCode가 같아야 한다, 2. 멤버변수의 값이 같아야 한다.
	
	@Override
	public int hashCode() {
		return Objects.hash(this.name, this.age);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member m = (Member)obj;
			if(m.name.equals(this.name) && m.age == this.age) {
				return true;
			}
		}
		else {
			return false;
		}
		return false;
		
	}
	
	
	
}
