package exam03;

//전원, 채널, 볼륨 
public class MonitorEx {
	
	public static void main(String[] args) {
		
		Monitor mo1 = new Monitor();
		mo1.power();
	
		mo1.channelUp();
		mo1.channeldown();
		
		mo1.volumeUp();
		mo1.volumeDown();
		
		mo1.showInfo();
		
		System.out.println(mo1);
		// = System.out.println(mo1.toString());
	}

}
