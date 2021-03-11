package exam03;

public class Message {

	private String command;
	private String to;
	
	public String getCommand() {
		return command;
	}
	
	public String getTo() {
		return to;
	}
	
	public Message(String command, String to) {
		super();
		this.command = command;
		this.to = to;
	}
	
	
	
}
