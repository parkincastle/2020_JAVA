package exam06;

public interface Remote {
	
	//���
	static final int MAX = 10;
	static final int MIN = 0;
	
	//�߻� �޼���
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);
	
	//default �޼���
	default void dmethod() {}
	
	//static �޼���
	static void smethod() {}
	
	
	
}
