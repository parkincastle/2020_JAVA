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
		
		System.out.println("제목 : " + getTitle());
		System.out.println("이름 : " + this.getName());
		System.out.println("내용 : " + this.getContent());
		System.out.println("받는사람 : " + receipent);
	}
	
	
	
}
