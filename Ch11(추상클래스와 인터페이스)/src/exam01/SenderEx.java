package exam01;

public class SenderEx {

	public static void main(String[] args) {
		
//		Kakao k = new Kakao("īī����", "ȫ�浿", "Hello");
//		k.sendMassage("�ȳ�!");
		
		Sender k = new Kakao("īī����", "ȫ�浿", "Hello");
		k.sendMassage("�迬��");
		
		Sender sms = new Sms("SMS�ܹ�", "������", "Nice to meet you");
		sms.sendMassage("��ٹ�");
		
		
	}

}
