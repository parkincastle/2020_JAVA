package exam01;
// 추상클래스란 : 한 개이상의 추상 메서드를 포함하는 클래스
// 추상클래스는 인스턴스를 생성할수 없다.
// 추상메서드는 선언부분만 있고 구현부가 없다.

public abstract class Sender {

	private String title;
	private String name;
	
	public Sender(String title, String name) {
		super();
		this.title = title;
		this.name = name;
	}

	public String getTitle() {
		return title;
	}

	public String getName() {
		return name;
	}
	
	//추상 메서드
	public abstract void sendMassage(String receipent); // 선언부
	//추상메서드는 반드시 상속을 통해서 재정의 해야한다.
	
	
}
