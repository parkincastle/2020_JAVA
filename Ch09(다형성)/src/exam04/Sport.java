package exam04;

class Baseball extends Sport {

	int player = 9;

	@Override
	public void rule(String name) {
		System.out.println("경기종목 : " + getName());
		System.out.println("플레이어 : " + this.player);
		System.out.println("경기규칙 : 야구의 규칙을 따름");

	}

}

class PingPong extends Sport {

	String team = "복식";

	@Override
	public void rule(String name) {
		System.out.println("경기종목 : " + getName());
		System.out.println("경기방식 : " + this.team);
		System.out.println("경기규칙 : 탁구의 규칙을 따름");
	}

}

public class Sport {

	private String name;

	public String getName() {
		return name;
	}

	public void rule(String name) {
		System.out.println("경기규칙 : 각 운동의 규칙을 따름");
	}

	public static void main(String[] args) {

		Sport s1 = new Baseball();
		s1.rule("BaseBall");
		
		Sport s2 = new PingPong();
		s2.rule("PingPong");
	}

}
