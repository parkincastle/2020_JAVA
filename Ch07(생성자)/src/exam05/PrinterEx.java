package exam05;
//������ Ŭ���� �׽�Ʈ�غ��� �����Լ�
public class PrinterEx {

	public static void main(String[] args) {
		
		//Ŭ������ �޸𸮿� �ε�
		Printer p = new Printer(100, true);
		//�����Ϳ� ���� 100�� �ֱ�
		//p.setPaper(100);
		//70�� ����ϱ�
		p.print(70, true);
		p.print(50, false);
		p.print(50, true);
		
		
	}

}
