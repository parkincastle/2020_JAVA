package exam01;

public class SenderEx {

	public static void main(String[] args) {
		
//		Kakao k = new Kakao("카카오톡", "홍길동", "Hello");
//		k.sendMassage("안녕!");
		
		Sender k = new Kakao("카카오톡", "홍길동", "Hello");
		k.sendMassage("김연아");
		
		Sender sms = new Sms("SMS단문", "송유현", "Nice to meet you");
		sms.sendMassage("백다미");
		
		
	}

}
