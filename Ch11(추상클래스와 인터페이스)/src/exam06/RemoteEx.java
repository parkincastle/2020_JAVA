package exam06;

public class RemoteEx {

	public static void main(String[] args) {
		
//		TV tv = new TV();
//		tv.turnOn();
//		tv.setVolume(5);
//		tv.turnOff();
		
//		Remote remote = new TV();
//		remote.turnOn();
//		remote.setVolume(20);
//		remote.turnOff();
		
		Remote[] remotes = {new TV(), new Audio()};
		
		for(Remote i : remotes) {
			i.turnOn();
			i.setVolume(100);
			i.turnOff();
			
			if(i instanceof TV) {
				((TV)i).show();
			}
			else if(i instanceof Audio) {
				((Audio)i).show();
			}
			
		}
		
		
	}

}
