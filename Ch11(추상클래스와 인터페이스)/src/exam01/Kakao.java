package exam01;

public class Kakao extends Sender{

	private String content;

	public Kakao(String title, String name, String content) {
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
