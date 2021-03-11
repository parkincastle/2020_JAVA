package exam04;

//접근제어자
//1번 : public(all)
//2번 : private
//3번 : protected(상속)
//4번 : default(같은 패키지)

public class Time {
	
	//멤버변수
	private int hour;
	int min;
	int sec;
	
	//getter(), setter()함수
	public int getHour() {
		
		return this.hour;
	}
	
	public void setHour(int hour) {
		
		if(hour < 0 || hour > 23) {
			System.out.println("시간입력 에러 ");
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

	//멤버메서드
	@Override	//재정의
	public String toString() {

		return getHour() + "시" + this.min + "분" + this.sec + "초";
		//
	}
	
	
	
}
