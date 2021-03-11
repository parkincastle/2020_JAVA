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
		
		System.out.println("제목 : " + getTitle());
		System.out.println("이름 : " + this.getName());
		System.out.println("내용 : " + this.getContent());
		System.out.println("받는사람 : " + receipent);
		
		
	}
	
	
	
}
