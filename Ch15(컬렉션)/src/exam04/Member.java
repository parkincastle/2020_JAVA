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
	
	//���� ���� ��ü�� ����  : 1. HashCode�� ���ƾ� �Ѵ�, 2. ��������� ���� ���ƾ� �Ѵ�.
	
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
