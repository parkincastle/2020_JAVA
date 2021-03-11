package exam01;

public class Sms extends Sender{

	private String content;

	public Sms(String title, String name, String content) {
		super(title, name);
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	@Override
	public void sendMassage(String receipent) {
		
		System.out.println("���� : " + getTitle());
		System.out.println("�̸� : " + this.getName());
		System.out.println("���� : " + this.getContent());
		System.out.println("�޴»�� : " + receipent);
		
		
	}
	
	
	
}
