package exam04;

//����������
//1�� : public(all)
//2�� : private
//3�� : protected(���)
//4�� : default(���� ��Ű��)

public class Time {
	
	//�������
	private int hour;
	int min;
	int sec;
	
	//getter(), setter()�Լ�
	public int getHour() {
		
		return this.hour;
	}
	
	public void setHour(int hour) {
		
		if(hour < 0 || hour > 23) {
			System.out.println("�ð��Է� ���� ");
			return;
		}
		this.hour = hour;
		
	}
	
	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		this.sec = sec;
	}

	//����޼���
	@Override	//������
	public String toString() {

		return getHour() + "��" + this.min + "��" + this.sec + "��";
		//
	}
	
	
	
}
