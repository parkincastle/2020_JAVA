package exam06;

public interface Remote {
	
	//상수
	static final int MAX = 10;
	static final int MIN = 0;
	
	//추상 메서드
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);
	
	//default 메서드
	default void dmethod() {}
	
	//static 메서드
	static void smethod() {}
	
	
	
}
